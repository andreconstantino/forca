/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.Jogador;
import persistencia.JogadorDAO;

/**
 *
 * @author Andre
 */
public class LoginControler {
    public Jogador logar(String login, String senha){
        JogadorDAO jogadorDAO = new JogadorDAO();
        Jogador jogador = null;
        jogador = jogadorDAO.obterJogador(login);
        if(senha.equals(jogador.getSenha())){
            return jogador;
        }
        return null;    
}
}
