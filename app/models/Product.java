package models;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
public class Product {

    @Id
    @Column(nullable = false)
    public Long id;
    @Column(length = 100, nullable = false)
    public String name;
    @Column(length = 20, nullable = false, unique = true)
    public String sku;
    @Column(precision = 9, scale = 2, nullable = false)
    public BigDecimal price;
    public int stock;
    @ManyToOne(optional = false)
    public Category category;

    public Product(String name, String sku, BigDecimal price, int stock, Category category){
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
}
