/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Andre
 */
public class HibernateEntityManagerFactory {
    private static EntityManagerFactory emf = null; 
    
    private HibernateEntityManagerFactory() {
    }
    
    public static EntityManager getEntityManager() {
        
        try {
            if (emf == null)
                emf = Persistence.createEntityManagerFactory("JogoDaForcaPU");
            return emf.createEntityManager();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
