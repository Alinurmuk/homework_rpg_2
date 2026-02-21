package com.narxoz.rpg.combat;
public class FireAbility implements Ability {
    private String name;
    private int damage;
    public FireAbility(String name, int damage) { this.name = name; this.damage = damage; }
    @Override public String getName() { return name; }
    @Override public int getDamage() { return damage; }
    @Override public String getDescription() { return "Отты шабуыл: " + name; }
    @Override public Ability clone() { return new FireAbility(this.name, this.damage); }
}