/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Turno;

/**
 *
 * @author Andre
 */
public class TurnoDAO {
    public void novoTurno(Turno turno){
      EntityManager em=HibernateEntityManagerFactory.getEntityManager();
      try{
          em.getTransaction().begin();
          em.persist(turno);
          em.getTransaction().commit();
      }catch(Exception e){
          e.printStackTrace();
      }finally{
          if(em!=null){
              em.close();
          }
      }
    }
    public List obterTurnos(){
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        List turno = null;
        try{
            Query q = em.createQuery("SELECT object(o)"
                                    + "FROM Turno as o;");
            turno = q.getResultList();
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return turno;
    }
}
