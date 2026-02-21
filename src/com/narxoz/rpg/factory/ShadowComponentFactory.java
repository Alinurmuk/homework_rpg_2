package com.narxoz.rpg.factory;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;

public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override public List<Ability> createAbilities() { return List.of(new ShadowAbility("Void Strike", 65)); }
    @Override public LootTable createLootTable() { return new ShadowLoot(); }
    @Override public String createAI() { return "TACTICAL"; }
}