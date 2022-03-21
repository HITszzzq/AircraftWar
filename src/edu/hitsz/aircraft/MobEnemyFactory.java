package edu.hitsz.aircraft;

//实现工厂接口的具体工厂类
public class MobEnemyFactory implements EnemyFactory{
    @Override
    public AbstractEnemy createEnemy(int locationX, int locationY, int speedX, int speedY, int hp){
        return new MobEnemy(locationX, locationY, speedX, speedY, hp);
    }
}
