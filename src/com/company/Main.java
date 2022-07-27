package com.company;

public class Main {
    public static void main(String[] args) {
        Boss Boss = new Boss(800,70,"physical");
        System.out.println(Boss.getHealth() + " " + Boss.getDamage() + " " + Boss.getDefenseType());

        createHeroes();
    }


    public static void createHeroes(){
        Hero hero1 = new Hero(200,25);
        Hero hero2 = new Hero(300,15,"healing");
        Hero hero3 = new Hero(250,40,"physical attack");

        Hero[] heroes = {hero1,hero2,hero3};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("hero" + i + " " + heroes[i].getHealth()
                    + " " + heroes[i].getDamage() + " " + heroes[i].getSuperPower());
        return;    
        }
    }
}
