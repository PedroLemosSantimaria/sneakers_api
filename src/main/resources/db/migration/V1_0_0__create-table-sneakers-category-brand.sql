CREATE TABLE sneaker_store.brand(
	id bigserial NOT NULL,
	"name" varchar(80) NOT NULL,
	description varchar(1000) NOT NULL,
	CONSTRAINT brand_primary_key PRIMARY KEY(id)
);


CREATE TABLE sneaker_store.category(
	id bigserial NOT NULL,
	"name" varchar(80) NOT NULL,
	description varchar(1000) NOT NULL,
	CONSTRAINT category_primary_key PRIMARY KEY(id)
);


CREATE TABLE sneaker_store.sneaker(
	id bigserial NOT NULL,
	"name" varchar(80) NOT NULL,
	price float8 NOT NULL,
	unity_measure varchar(5) NOT NULL,
	"size" float8 NOT NULL,
	color varchar(20) NOT NULL,
	category_id int8,
    brand_id int8,
	CONSTRAINT fk_sneaker_category FOREIGN KEY(category_id)
	REFERENCES sneaker_store.category(id),

	CONSTRAINT fk_sneaker_brand FOREIGN KEY(brand_id)
	REFERENCES sneaker_store.brand(id),

	CONSTRAINT sneaker_primary_key PRIMARY KEY(id)
);