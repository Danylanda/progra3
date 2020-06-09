package com.daniela.hicua.Model;
import javax.persistence.*;

@Entity
@Table(name = "Diccionario")
public class DiccionarioMo {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "Ingles", length = 250, nullable = false)
    private String ingles;

    @Column(name = "Portugues", length = 250, nullable = false)
    private String portugues;

    @Column(name = "Word", length = 250, nullable = false)
    private String word;
public DiccionarioMo() {
}
    public DiccionarioMo(String ingles, String portugues, String word) {
        this.ingles = ingles;
        this.portugues = portugues;
        this.word = word;
    }

    public DiccionarioMo(String ingles, String first) {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String english) {
        this.ingles = english;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}