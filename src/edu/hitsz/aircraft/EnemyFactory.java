package edu.hitsz.aircraft;

//工厂接口
public interface EnemyFactory {
    public abstract AbstractEnemy createEnemy(int locationX, int locationY, int speedX, int speedY, int hp);
}
