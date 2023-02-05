package com.bilgeadam.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Sergi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String sergiAdi;

    private String baslangıcTarihi;

    private String bitisTarihi;

    private String konusu;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Muze> muzeList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Eser> eserList;

    public Sergi(String sergiAdi, String baslangıcTarihi, String bitisTarihi, String konusu, List<Muze> muzeList) {
        this.sergiAdi = sergiAdi;
        this.baslangıcTarihi = baslangıcTarihi;
        this.bitisTarihi = bitisTarihi;
        this.konusu = konusu;
        this.muzeList = muzeList;

    }
}
