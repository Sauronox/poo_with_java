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
public class RpgCord {
    static Personnage hero = new Personnage();
    static Monster monster1 =  new Monster("Wolf",5,5,5,0,0,3);


    public static void main(String[]args){
        System.out.println("Hello World !");
        System.out.println(" My name is alan");
        System.out.println("I learn the POO in Java");
        System.out.println("Bye !!");
        
        hero.ficheHero();
        

        
        System.out.println(monster1.getName());

        
    }

}
