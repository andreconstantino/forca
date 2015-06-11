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
    
    public static IJogadorDAO obterJogadorDAO(boolean useHibernate) {
        if(useHibernate)
            return new JogadorDAO();
        
        return new JogadorJDBCDAO();
    }   
    
    public static IPalavraDAO obterPalavraDAO(boolean useHibernate){
        if(useHibernate)
            return new PalavraDAO();        
        return new PalavraJdbcDAO();
    }
    
    public static ITurnoDAO obterTurnosDAO(){
        return new TurnoDAO();
    }
}
