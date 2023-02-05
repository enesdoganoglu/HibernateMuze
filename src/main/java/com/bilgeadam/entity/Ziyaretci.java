package com.bilgeadam.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ziyaretci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ziyaretciAdi;

    private int yas;

    private int telefonNo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sergi> sergiList;
}
