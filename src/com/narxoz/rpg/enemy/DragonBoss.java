package com.narxoz.rpg.enemy;
public class DragonBoss extends Enemy {
    @Override public void displayInfo() {
        System.out.println("[BOSS] " + name + " | HP: " + health + " | AI: " + ai);
        System.out.println(lootTable.getLootInfo());
    }
}