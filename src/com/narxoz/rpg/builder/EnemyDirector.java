package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.*;

public class EnemyDirector {
    public Enemy createFireBoss(EnemyBuilder b) {
        return b.setName("Ancient Fire Dragon").setHealth(5000).setFactory(new FireComponentFactory()).build();
    }
    public Enemy createIceBoss(EnemyBuilder b) {
        return b.setName("Frozen Titan").setHealth(4500).setFactory(new IceComponentFactory()).build();
    }
}