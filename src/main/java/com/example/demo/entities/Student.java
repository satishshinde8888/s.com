package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student_info")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "about")
    private String about;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    public Student(Integer id, String name, String about, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.laptop = laptop;
    }

    public Student() {
    }


}
