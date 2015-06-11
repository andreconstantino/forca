/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.Palavra;
import persistencia.IPalavraDAO;
import persistencia.PalavraDAO;
import persistencia.PersistenciaFactory;

/**
 *
 * @author Andre
 */
public class ControlerJogo implements IControllerJogo {
    
    public Palavra obterPalavra(){
      IPalavraDAO palavraDAO = PersistenciaFactory.obterPalavraDAO(false);
      return palavraDAO.obterPalavraAleatoria();
      
    }
}
