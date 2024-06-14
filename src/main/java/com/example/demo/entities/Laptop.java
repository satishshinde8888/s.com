package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "laptops")
public class Laptop {
    @Id
    @Column(name = "laptop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String modelNumber;
    private String brand;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;


    public Laptop(Integer id, String modelNumber, String brand, Student student) {
        this.id = id;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.student = student;
    }
    public Laptop() {
    }

}
