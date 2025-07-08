package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "address")
public class Address {
    @Id
    private int addressId;
    private String street;
    private String city;
    private String state;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
