package com.narxoz.rpg;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;

public class Main {
    public static void main(String[] args) {
        EnemyBuilder builder = new EnemyBuilder();
        EnemyDirector director = new EnemyDirector();
        EnemyRegistry registry = new EnemyRegistry();

        Enemy fireBoss = director.createFireBoss(builder);
        registry.addTemplate("fire_boss", fireBoss);
        Enemy clone = registry.createVariant("fire_boss");
        clone.setName("Inferno Clone");

        System.out.println("--- RPG SYSTEM DEMO ---");
        fireBoss.displayInfo();
        clone.displayInfo();
    }
}