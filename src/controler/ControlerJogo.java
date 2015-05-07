/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.Palavra;
import persistencia.PalavraDAO;

/**
 *
 * @author Andre
 */
public class ControlerJogo {
    
    public Palavra obterPalavra(){
      PalavraDAO palavraDAO = new PalavraDAO();
      return palavraDAO.obterPalavraAleatoria();
      
    }
}
