package com.narxoz.rpg.loot;
public class ShadowLoot implements LootTable {
    private String item = "Dark Essence";
    @Override public String getLootInfo() { return "Loot: " + item; }
    @Override public LootTable clone() { return new ShadowLoot(); }
}