package com.narxoz.rpg.enemy;
public class Goblin extends Enemy {
    @Override public void displayInfo() {
        System.out.println("[GOBLIN] " + name + " | HP: " + health);
    }
}