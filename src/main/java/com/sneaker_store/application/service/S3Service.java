package com.sneaker_store.application.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Exception;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class S3Service {

    @Value("${spring.cloud.aws.s3.bucket}")
    private String bucketName;

    private final S3Client s3Client;

    public S3Service(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    public String uploadFile(MultipartFile file) throws IOException{
        String filename = System.currentTimeMillis() + "_" + file.getOriginalFilename();
        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(filename)
                .build();

        try {
            s3Client.putObject(putObjectRequest, RequestBody.fromBytes(file.getBytes()));

        }catch (S3Exception e) {
            throw new IOException("Erro ao fazer upload para o S3", e);
        }

        return s3Client.utilities().getUrl(builder -> builder
                .bucket(bucketName)
                .key(filename)).toExternalForm();
    }

    public void deleteFile(String imagePath) {
        try {
            URL s3Url = new URL(imagePath);
            String key = s3Url.getPath().substring(1);

            DeleteObjectRequest deleteObjectRequest = DeleteObjectRequest.builder()
                    .bucket(bucketName)
                    .key(key)
                    .build();

        s3Client.deleteObject(deleteObjectRequest);

        }catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }
}
