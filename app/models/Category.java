package models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @Column(nullable = false)
    public Long id;
    @Column(length = 50, nullable = false, unique = true)
    public String name;
    @Column(length = 3, nullable = false, unique = true)
    public String code;
    public String description;
    @Column(nullable = false)
    public boolean active;
    @OneToMany(mappedBy = "category")
    public List<Product> products;

}
