/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;

/**
 *
 * @author a1320548
 */
public class ControlerFactory {
    public static IControllerJogo obterControlerJogo(){
        return new ControlerJogo();
    }
    
    public static ILogin obterLoginJogo(){
        return new LoginControler();
    }
}
