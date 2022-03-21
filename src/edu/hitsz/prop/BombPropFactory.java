package edu.hitsz.prop;

//实现工厂接口的具体工厂类
public class BombPropFactory implements PropFactory{
    @Override
    public BaseProp createProp(int locationX, int locationY, int speedX, int speedY) {
        return new BombProp(locationX, locationY, speedX, speedY);
    }

    @Override
    public BaseProp createProp(int locationX, int locationY, int speedX, int speedY, int power) {
        return new BombProp(locationX, locationY, speedX, speedY);
    }
}
