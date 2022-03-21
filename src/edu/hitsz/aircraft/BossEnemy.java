package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

/**
 * BOSS敌机
 *
 * @author 200111130周忠全
 */

public class BossEnemy extends AbstractEnemy{

    /**
     * @param locationX BOSS敌机位置x坐标
     * @param locationY BOSS敌机位置y坐标
     * @param speedX BOSS敌机的速度
     * @param speedY BOSS敌机的速度
     * @param hp    初始生命值
     */
    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }


    public List<BaseBullet> shoot(){
        List<BaseBullet> res = new LinkedList<>();
        return res; //实验一不需完成部分，以后再做补充
    }
}
