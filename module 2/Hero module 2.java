package com.company;

public class Main {

    public static void main(String[] args) {

    }
}
class Location {
    int x = 0;
    int y = 0;
    int z = 0;
}
class Hero{
    int damage = 0;
    int health = 0;
    String type = "";
   Location loc;
   boolean atak = true;
   boolean def = false;
    int heath_potion = 0;

    public Hero(int damaget , int health1 ,String type1){
        damage = damaget;
        health = health1;
        type = type1;

    }
    public Hero(int x , int y , int z){
    loc.x = x;
    loc.y = y;
    loc.z = z;
    }
    public void Move(int x , int y , int z){
        loc.x += x;
        loc.y += y;
        loc.z += z;
        System.out.println("position(x,y,z) -"+ loc.x +" " + loc.y + " " + loc.z);

    }
    void attack(Hero a, Hero b){
        if(a.loc.x == b.loc.x && a.loc.y == b.loc.y && a.loc.z == b.loc.z) {
            if(a.def!=true)
            b.health -= a.damage;
            if (a.def==true) b.health -= (a.damage/2);

        }
        System.out.println("health -"+ b.health);
    }
    void usePotion(Hero a){
        if(a.heath_potion!=0) {
            a.heath_potion--;
            a.health += 20;
        }
        System.out.println("health -"+ a.health);


    }
    void setAtak(Hero a){
        a.atak= true;
        a.def = false;
        System.out.println("Ataking");
    }
    void setDef(Hero a){
        a.atak= false;
        a.def = true;
        System.out.println("Defenging");

    }
    void findInfo(Hero a){
        System.out.println("health -"+ a.health);
        System.out.println("damage -"+ a.damage);
        System.out.println("type -"+ a.type);
        System.out.println("position(x,y,z) -"+ a.loc.x +" " + a.loc.y + " " + a.loc.z);
        if( a.def == true){ System.out.println("he is deffending"); }
        if( a.atak == true){ System.out.println("he is atacing"); }

    }
}