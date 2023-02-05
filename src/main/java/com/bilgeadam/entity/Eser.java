package com.bilgeadam.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Eser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String eserAdi;

    private Integer yapimYili;

    @ManyToOne(cascade = CascadeType.ALL)
    private Sanatci sanatci;

    @ManyToOne(cascade = CascadeType.ALL /*mappedBy="S"*/)
    private Sergi sergi;

    public Eser(String eserAdi, Integer yapimYili, Sanatci sanatci, Sergi sergi) {
        this.eserAdi = eserAdi;
        this.yapimYili = yapimYili;
        this.sanatci = sanatci;
        this.sergi = sergi;
    }
}
