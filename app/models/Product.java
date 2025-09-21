package models;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    public Long id;
    public String name;
    public String sku;
    public Long price;
    public int stock;
    public Category category;
}
