package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;

import java.util.List;

/**
 * 所有敌机的抽象父类：
 * 敌机（BOSS, ELITE, MOB）
 *
 * @author 200111130周忠全
 */
public abstract class AbstractEnemy extends AbstractAircraft{

    public AbstractEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    public abstract List<BaseBullet> shoot();
}
