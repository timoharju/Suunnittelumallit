/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author wasab
 */
public class Opiskelija extends AterioivaOtus {

    
    public Juoma createJuoma() {
      return new Mehu(); 
    }
    
}
