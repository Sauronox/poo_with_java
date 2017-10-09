/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alan.groupevo.poo_cours;

/**
 *
 * @author alan
 */
public class DamageManager{
  
    public void combat(Personnage cPerso, Monster cMonster){

        System.out.println("Combat: "+cPerso.getName+" blesse "+ cMonster.getName+" et perd "+cPerso.getForce+"pv ("+cMonster.getPV+"/"+cMonster.getMaxHP+")");
        
        
    }
}
