/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Jogador;
import model.Palavra;

/**
 *
 * @author Andre
 */
public class PalavraDAO {
    
    public void cadastrarPalavra(Palavra palavra){
      EntityManager em=HibernateEntityManagerFactory.getEntityManager();
      try{
          em.getTransaction().begin();
          em.persist(palavra);
          em.getTransaction().commit();
      }catch(Exception e){
          e.printStackTrace();
      }finally{
          if(em!=null){
              em.close();
          }
      }
    }
    public Palavra obterPalavraAleatoria(){
        EntityManager em=HibernateEntityManagerFactory.getEntityManager();
        List palavras = null;
        Palavra palavraEscolhida = null;
        int numeroAleatorio;
        try{
            Query q = em.createQuery("SELECT object(o) "
                                    + "FROM Palavra as o"   );
            palavras = q.getResultList();
            Random gerador = new Random();
            numeroAleatorio = gerador.nextInt(palavras.size() + 1);
            palavraEscolhida = (Palavra) palavras.get(numeroAleatorio-1);
            
        }catch(Exception e){
          e.printStackTrace();
        }finally{
          if(em!=null){
              em.close();
          }
        }return palavraEscolhida;
    }
}
