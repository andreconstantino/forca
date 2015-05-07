/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Andre
 */
//@Entity
public class Turno {
    //@Id
   // @GeneratedValue(strategy = IDENTITY)
    private int idTurno;
    private int errosCometidos;
    //private List letrasUsadas;
    //@ManyToOne(fetch = FetchType.EAGER)
   // @JoinColumn(name = "loginjogador")
    private Jogador jogador;
    private boolean statusVitoria;

    public int getErrosCometidos() {
        return errosCometidos;
    }

    public void setErrosCometidos(int errosCometidos) {
        this.errosCometidos = errosCometidos;
    }
/*
    public List getLetrasUsadas() {
        return letrasUsadas;
    }

    public void setLetrasUsadas(List letrasUsadas) {
        this.letrasUsadas = letrasUsadas;
    }
*/
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public boolean isStatusVitoria() {
        return statusVitoria;
    }

    public void setStatusVitoria(boolean statusVitoria) {
        this.statusVitoria = statusVitoria;
    }
}
