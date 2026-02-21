package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;

public class FireComponentFactory implements EnemyComponentFactory {
    @Override public List<Ability> createAbilities() { return List.of(new FireAbility("Fire Breath", 50)); }
    @Override public LootTable createLootTable() { return new FireLoot(); }
    @Override public String createAI() { return "AGGRESSIVE"; }
}