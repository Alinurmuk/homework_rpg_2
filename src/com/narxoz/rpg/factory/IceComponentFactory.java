package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {
    @Override public List<Ability> createAbilities() { return List.of(new IceAbility("Frost Nova", 40)); }
    @Override public LootTable createLootTable() { return new IceLoot(); }
    @Override public String createAI() { return "DEFENSIVE"; }
}