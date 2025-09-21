package models;

import io.ebean.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    public Long id;

    public String name;
    public String code;
    public String description;
    public boolean active;
    public List<Product> products;

}
