/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Andre
 */
@Entity
public class Palavra {
    @Id
    private String palavra;
    private String dica;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "loginjogador")
    private Jogador autorPalavra;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public Jogador getAutorPalavra() {
        return autorPalavra;
    }

    public void setAutorPalavra(Jogador autorPalavra) {
        this.autorPalavra = autorPalavra;
    }
    
}
