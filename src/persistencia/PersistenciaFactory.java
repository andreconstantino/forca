/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Andre
 */
public class PersistenciaFactory {
    
    public static IJogadorDAO obterJogadorDAO() {
        return new JogadorDAO();
    }   
    
    public static IPalavraDAO obterPalavraDAO(){
        return new PalavraDAO();        
    }
    
    public static ITurnoDAO obterTurnosDAO(){
        return new TurnoDAO();
    }
}
