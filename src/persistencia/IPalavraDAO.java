/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import model.Palavra;

/**
 *
 * @author a1320769
 */
public interface IPalavraDAO {
     public void cadastrarPalavra(Palavra palavra);
      public Palavra obterPalavraAleatoria();
}
