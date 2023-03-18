package org.bcit.comp2522.midterm.bonus;

import java.util.Random;

public class Basic_02_player {

    /**
     * this class is a player class that has health, armour and weapon
     * the main method stimulates a fight between two players, where the players start off with the same
     * health and armour, and the player who raches 0 health first loses
     * players are given a random weapon damage value between 6 and 12
     *
     * this is similar to basic_02 of midterm because both have an action that continues to happen until
     * something runs out in my case it was health, and in the midterm it was the gas tank
     * and both test the use of multiple objects (health/gas) in use at the same time by a single object (player1/car)
     */

    private Basic_02_health health;
    private Basic_02_armour armour;
    private Basic_02_weapon weapon;

    // this is the constructor for the player class, it takes in a health, armour, and weapon object and assigns them to the player
    public Basic_02_player(Basic_02_health health, Basic_02_armour armour, Basic_02_weapon weapon) {
        this.health = health;
        this.armour = armour;
        this.weapon = weapon;
    }

    //this method stimulates the attacj of a player on another player, every time a player attacks the other player
    //the damage is calculated by subtracting the armour level from the weapon damage
    //if the damage is greater than 0 then the health of the target is reduced by the damage
    //if the armour level is greater than 0 then the armour level is reduced by 1
    void attack(Basic_02_player target) {
        int damage = this.weapon.damage - target.armour.level;
        if (damage > 0) {
            target.health.health -= damage;
        }
        if (target.armour.level > 0) {
            target.armour.level--;
        }
    }

    // this method returns the health of the player
    public int getHealth() {
        return health.health;
    }

    // this method returns the armour level of the player
    public int getArmour() {
        return armour.level;
    }

    // this method returns stats of a player
    public String toString() {
        return "health: " + health.health + "\tarmour: " + armour.level + "\tweapon: " + weapon.damage;
    }

    public static void main(String[] args) {
        Random random = new Random();
        // players start off with a random weapon damage between 6 and 12 and 5 armour and 100 health
        Basic_02_player player1 = new Basic_02_player(new Basic_02_health(), new Basic_02_armour(5), new Basic_02_weapon(random.nextInt(7) + 6));
        Basic_02_player player2 = new Basic_02_player(new Basic_02_health(), new Basic_02_armour(5), new Basic_02_weapon(random.nextInt(7) + 6));
        System.out.format("==========Starting Stats==========\nplayer1: %s\nplayer2: %s\n", player1, player2);
        System.out.println("==========Starting Fight==========");
        //simulate a fight between two players until one of them reaches 0 health
        while (player1.health.health > 0 && player2.health.health > 0) {
            // randomly choose a player to attack the other
            if (random.nextBoolean()) {
                player1.attack(player2);
            } else {
                player2.attack(player1);
            }
            System.out.format("player1 health: %s" + "\tplayer1 armour level : %s\n", player1.getHealth(), player1.getArmour());
            System.out.format("player2 health: %s" + "\tplayer2 armour level : %s\n", player2.getHealth(), player2.getArmour());
            if (player1.health.health <= 0) {
                System.out.println("==========player2 wins!=============");
            } else if (player2.health.health <= 0) {
                System.out.println("==========player1 wins!=============");
            }
        }
        System.out.println("==========fight over!=============");
    }
}