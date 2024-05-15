package PokemonBase;


public class PokemonBase {
    //Step 1: define attributes
    
    String name;
    int health_stat;
    int attack_stat;
    double defense_stat;
    
    //Step 2: Default constructor
    public PokemonBase(){
        name = " ";
        health_stat = 15;
        attack_stat = 25;
        defense_stat = 0.05;
    }
    
    //Step 3: Parameter constructor
    public PokemonBase(String name, int health_stat, int attack_stat,double defense_stat){
        this.name = name;
        this.health_stat = health_stat;
        this.attack_stat = attack_stat;
        this.defense_stat = defense_stat;
    }
    
    //Step 4: Accessors (Getters)
    public String getName(){
        return name;
    }
    public int getHeathStat(){
        return health_stat;
    }
    public int getAttackStat(){
       return attack_stat;
    }
    public double getDefenseStat(){
       return defense_stat;
    }
    
    //Step 5: Mutators (note: always void)
    public void setName(String name){
        this.name = name;
    }
    public void setHealthStat(int health_stat){
        this.health_stat = health_stat;
    }
    public void setAttackStat(int attack_stat){
        this.attack_stat = attack_stat;
    }
    public void setDefenseStat(int health_stat){
        this.health_stat = health_stat;
    }
    
    
    
    //Step 6: toString();
    public String toString(){
        if(health_stat == 0){
           return "---\nPokemon Stats: " + 
                "\n" + name + " HAS FAINTED!" +
                "\nName: " + name +
                "\nHealth Stat: " + health_stat + 
                "\nAttack Stat: " + attack_stat + 
                "\nDefense Stat: " + defense_stat+
                "\n---"; 
        }
        else{
        return "---\nPokemon Stats: " + 
                "\nName: " + name +
                "\nHealth Stat: " + health_stat + 
                "\nAttack Stat: " + attack_stat + 
                "\nDefense Stat: " + defense_stat+
                "\n---";
        }
    }
    
    //Step 7: int attack whack
    public void attack(PokemonBase enemy){
        System.out.println(name + " Attacks " + enemy.name + "!");
        double totalattackdamage = (attack_stat*(1-enemy.defense_stat));
        System.out.println(name + " Does " + totalattackdamage + " Damage!");
        enemy.health_stat -= totalattackdamage;
        if(enemy.health_stat < 0){
            enemy.health_stat = 0;
        }
    }
    
    public void damage(int damage){
        health_stat -= damage;
        System.out.println(name + " took " + damage + " damage!"
                + "\n" + name + " has " + health_stat + " left!");  
    }
    public void heal(){
        health_stat += 20;
        System.out.println(name + " has healed " + 20 + " points."
                + "\n" + name + " has \" + health_stat + \" left!\"");
    }
    
    public static void main(String[] args) {
        PokemonBase Squirtle = new PokemonBase("Squirtle",100,35,0.05);
        PokemonBase Machop = new PokemonBase("Machop",85,30,.07);
        PokemonBase Arceus = new PokemonBase("Arceus",999, 100000, .99);
        System.out.println("TURN 1\n---\n");
        System.out.println(Squirtle.toString());
        System.out.println(Machop.toString());
        System.out.println(Arceus.toString());
        Arceus.attack(Squirtle);
        Arceus.attack(Machop);
        System.out.println("TURN 2\n---\n");
        System.out.println(Squirtle.toString());
        System.out.println(Machop.toString());
        System.out.println(Arceus.toString());
        Squirtle.heal();
        Machop.heal();
        System.out.println("TURN 3\n---\n");
        System.out.println(Squirtle.toString());
        System.out.println(Machop.toString());
        System.out.println(Arceus.toString());
        
    }
    
}
