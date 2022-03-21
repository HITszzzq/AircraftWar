package edu.hitsz.prop;

//工厂接口
public interface PropFactory {
    public abstract BaseProp createProp(int locationX, int locationY, int speedX, int speedY);
    public abstract BaseProp createProp(int locationX, int locationY, int speedX, int speedY, int power);
}
