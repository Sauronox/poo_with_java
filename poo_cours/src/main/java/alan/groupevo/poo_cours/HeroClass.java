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
public class HeroClass {
    
    class Warrior extends Personnage{
      private String sorts [];
      private String techniques[];
      private int levelClass;
      private int currentLevelClass;
      private String typeClass;
      
    }
    class Mage extends Personnage{
      private String sorts [];
      private int levelClass;
      private int currentLevelClass;
      private String typeClass;
      
    }
    class Archer extends Personnage{
      private String techniques[];
      private int levelClass;
      private int currentLevelClass;
      private String typeClass;
      
    }
    class Berzerk extends Personnage{
      private String techniques[];
      private int levelClass;
      private int currentLevelClass;
      private String typeClass;
      
    }
    class Ninja extends Personnage{
      private String techniques[];
      private int levelClass;
      private int currentLevelClass;
      private String typeClass;
      
      public Ninja(){
           super();
           super.setClassName("Ninja");
      }
    }
}
