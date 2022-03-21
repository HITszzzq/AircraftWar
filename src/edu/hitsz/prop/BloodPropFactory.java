package edu.hitsz.prop;

//实现工厂接口的具体工厂类
public class BloodPropFactory implements PropFactory{
    @Override
    public BaseProp createProp(int locationX, int locationY, int speedX, int speedY) {
        return new BloodProp(locationX, locationY, speedX, speedY, 10);
    }

    @Override
    public BaseProp createProp(int locationX, int locationY, int speedX, int speedY, int power){
        return new BloodProp(locationX, locationY, speedX, speedY, power);
    }
}
