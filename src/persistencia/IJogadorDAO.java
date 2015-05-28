/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import model.Jogador;

/**
 *
 * @author Andre
 */
public interface IJogadorDAO {
    public abstract void novoJogador(Jogador jogador);
    public abstract Jogador obterJogador(String login);
}
