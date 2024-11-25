package com.sneaker_store.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sneaker")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sneaker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sneaker_id_seq_generator")
    @SequenceGenerator(name = "sneaker_id_seq_generator", sequenceName = "sneaker_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "unity_measure")
    private String unityMeasure;

    @Column(name = "size")
    private double size;

    @Column(name = "color")
    private String color;

    @Column(name = "image_path")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

}
