package com.narxoz.rpg.enemy;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.*;

public abstract class Enemy implements Cloneable {
    protected String name;
    protected int health;
    protected List<Ability> abilities = new ArrayList<>();
    protected LootTable lootTable;
    protected String ai;

    public void setName(String n) { this.name = n; }
    public void setHealth(int h) { this.health = h; }
    public void setAbilities(List<Ability> a) { this.abilities = a; }
    public void setLootTable(LootTable l) { this.lootTable = l; }
    public void setAi(String ai) { this.ai = ai; }

    @Override public Enemy clone() {
        try {
            Enemy copy = (Enemy) super.clone();
            copy.abilities = new ArrayList<>();
            for(Ability a : this.abilities) copy.abilities.add(a.clone());
            copy.lootTable = this.lootTable.clone();
            return copy;
        } catch (Exception e) { return null; }
    }
    public abstract void displayInfo();
}