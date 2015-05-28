/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.util.List;
import model.Turno;

/**
 *
 * @author a132067x
 */
public interface ITurnoDAO {
    public void novoTurno(Turno turno);
    public List obterTurno();
}
