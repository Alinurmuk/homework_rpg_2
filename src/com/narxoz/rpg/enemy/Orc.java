package com.narxoz.rpg.enemy;
public class Orc extends Enemy {
    @Override public void displayInfo() {
        System.out.println("[ORC] " + name + " | HP: " + health);
    }
}