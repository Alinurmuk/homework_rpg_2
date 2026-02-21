package com.narxoz.rpg.loot;
public class FireLoot implements LootTable {
    private String item = "Fire Crystal";
    @Override public String getLootInfo() { return "Loot: " + item; }
    @Override public LootTable clone() { return new FireLoot(); }
}