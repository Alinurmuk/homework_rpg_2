package com.narxoz.rpg.enemy;
import java.util.*;
public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();
    public void addTemplate(String key, Enemy e) { templates.put(key, e); }
    public Enemy createVariant(String key) { return templates.get(key).clone(); }
}