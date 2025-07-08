package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = " product")

public class Product {
    @Id
    private String pId;
    private String pName;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;

}
