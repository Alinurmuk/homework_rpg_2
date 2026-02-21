package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class EnemyBuilder {
    private String name;
    private int health;
    private EnemyComponentFactory factory;

    public EnemyBuilder setName(String n) { this.name = n; return this; }
    public EnemyBuilder setHealth(int h) { this.health = h; return this; }
    public EnemyBuilder setFactory(EnemyComponentFactory f) { this.factory = f; return this; }

    public Enemy build() {
        Enemy e = new DragonBoss();
        e.setName(name);
        e.setHealth(health);
        e.setAbilities(factory.createAbilities());
        e.setLootTable(factory.createLootTable());
        e.setAi(factory.createAI());
        return e;
    }
}