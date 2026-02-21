package com.narxoz.rpg.loot;
public class IceLoot implements LootTable {
    private String item = "Ice Shard";
    @Override public String getLootInfo() { return "Loot: " + item; }
    @Override public LootTable clone() { return new IceLoot(); }
}