package com.narxoz.rpg.enemy;
public class Skeleton extends Enemy {
    @Override public void displayInfo() {
        System.out.println("[SKELETON] " + name + " | HP: " + health);
    }
}