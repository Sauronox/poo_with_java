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
public class Monster {
    
    private String name;
    private String difficulty;
    private int level;
    private int hp;
    private int maxHp;
    private int mana;
    private int rp;
    private int force;
    
    public Monster(String name,int lvl, int hp, int maxHp, int mana, int rp, int force){
     //   String names [] = {"Wolf","Orc","Goblin","Elf","Spider","Skeleton","Zombie","Dragon"};
             
        this.name = name;
        this.difficulty = "Facile";
        this.level = lvl;
        this.hp = hp;
        this.maxHp = maxHp;
        this.mana = mana;
        this.rp = rp;
        this.force = force;
    }
    
    // *************** Getter *****************
    
    public String getName(){
        return this.name;
    }
    public String getDifficulty(){
        return this.difficulty;
    }
    public int getLevel(){
        return this.level;
    }
    public int getHp(){
        return this.hp;
    }
    public int getMaxHp(){
        return this.maxHp;
    }
    public int getMana(){
        return this.mana;
    }
    public int getRp(){
        return this.rp;
    }
    public int getForce(){
        return this.force;
    }
    
    // *************** Setter ****************
    
    public void setName(String name){
        this.name = name;
    }
    public void setDiffuculty(String diff){
        this.difficulty = diff;
    }
    public void setLevel(int lvl){
        this.level = lvl;
    }
   public void setHp(int hp){
       this.hp = hp;
   }
   public void setMaxHp(int maxHp){
       this.maxHp = maxHp;
   }
   public void setMana(int mana){
       this.mana = mana;
   }
   public void setRp(int rp){
       this.rp = rp;
   }
   public void setForce(int force){
       this.force = force;
   }
   
}
