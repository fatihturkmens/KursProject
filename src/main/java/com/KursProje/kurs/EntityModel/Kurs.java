package com.KursProje.kurs.EntityModel;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Kurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String isim;
    private double ücret;

}
