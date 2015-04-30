/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Jogador;
import model.Turno;

/**
 *
 * @author Andre
 */
public class JogadorDAO {
    public void novoJogador(Jogador jogador){
      EntityManager em=HibernateEntityManagerFactory.getEntityManager();
      try{
          em.getTransaction().begin();
          em.persist(jogador);
          em.getTransaction().commit();
      }catch(Exception e){
          e.printStackTrace();
      }finally{
          if(em!=null){
              em.close();
          }
      }
    }
    public Jogador obterJogador(String login){
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        Jogador jogador = null;
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Jogador as o "
                                    + "WHERE login = '"
                                    + login + "'");
            jogador = (Jogador) q.getSingleResult();
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return jogador;
    }
}
