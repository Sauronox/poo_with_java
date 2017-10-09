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
public class Personnage {
    
    /* Attribue
     * @ Type : String , int
     * @ Range : privée(seulement a cette classe)
     * @ 
     */
    
    final private String name;
    protected String className;
    // 
    private int healPoint;
    private int maxHealthPoint;
    private int mana;
    private int ragePoint;
    private int experience;
    private int courrentXP;
    private int level;
    // 
    private int force;
    private int intelligence;
    private int agility;
    private int dexterity;
    //
    private int damage;
    private int resistance;
 
    // ******************* METHODE ******************
      
    //constructeur
    public Personnage(){
        this.name = "Sauronox"; 
        this.healPoint = 10;
        this.maxHealthPoint = 10;
        this.mana = 15;
        this.ragePoint = 0;
        this.experience = 5;
        this.level = 1;
        this.force = 3;
        this.intelligence = 1;
        this.agility = 3;
        this.dexterity = 2;
        this.damage = 2;
    } 
    public Personnage(String name, HeroClass className){
        this.name = name; 
        className = new HeroClass();
        this.healPoint = 10;
        this.maxHealthPoint = 10;
        this.mana = 5;
        this.ragePoint = 0;
        this.experience = 0;
        this.level = 1;
        this.force = 1;
        this.intelligence = 1;
        this.agility = 1;
        this.dexterity = 1;      
    }
    
    public void ficheHero(){
        System.out.println("+----------------------------+");
        System.out.println("|       STATS Personnage     |");
        System.out.println("+----------------------------+");
        System.out.println("|  Pseudo: "+this.getName());
        System.out.println("|  Classe: "+this.className);
        System.out.println("|  HP: " +this.healPoint+"/"+this.getMaxHealthPoint());
        System.out.println("|  MP: " +this.mana);
        System.out.println("|  RP: " +this.ragePoint);
        System.out.println("|  XP: " +this.experience);
        System.out.println("|  LVL: " +this.level);
        System.out.println("|  Force: " +this.force);
        System.out.println("|  Intel: " +this.intelligence);
        System.out.println("|  Agilité: "+this.agility);
        System.out.println("|  Dextérité: "+this.dexterity);
        System.out.println("+----------------------------+");
        
    }
    public void  combat(Personnage personnage){

         personnage.healPoint -= this.damage;
         System.out.println("Combat : "+ this.getName() +" blesse "+personnage.getName()+" de " +this.getDamage()+" point de dégat");
         System.out.println("Combat : "+personnage.getName() +" a mintenant "+personnage.getHealPoint()+"/"+personnage.getMaxHealthPoint());
    }
    
    // *************** GETTER *****************

    public String getName(){
        return this.name;
    }
    public String getClassName(){
        return this.className;
    }
    public int getHealPoint(){
        return this.healPoint;
    }
    public int getMaxHealthPoint(){
        return this.maxHealthPoint;
    }
    public int getMana(){
        return this.mana;
    }
    public int getRagePoint(){
        return this.ragePoint;
    }
    public int getExperience(){
        return this.experience;
    }
    public int getCurrentXP(){
        return this.courrentXP;
    }
    public int getLevel(){
        return this.level;
    }
    public int getForce(){
        return this.force;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    public int getAgility(){
        return this.agility;
    }
    public int getDexterity(){
        return this.dexterity;
    }
    public int getDamage(){
        return this.damage;
    }
    
    
    // *************** SETTER *****************

 //   public void setName(String name){
 //       this.name = name;
 //   } 
    public void setClassName(String className){
        this.className = className;
    }
    public void setHealPoint(int healPoint){
        this.healPoint = healPoint;
    }
    public void setMaxHealthPoint(int healthPoint){
        this.maxHealthPoint = healthPoint;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public void setRagePoint(int ragePoint){
        this.ragePoint = ragePoint;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
    public void setCurrentXP(int currentXP){
        this.courrentXP = currentXP;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setForce(int force){
        this.force = force;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public void setAgility(int agility){
        this.agility = agility;
    }
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    
}
