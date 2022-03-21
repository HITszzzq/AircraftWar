package edu.hitsz.prop;

/**
 * 加血道具
 *
 * @author 200111130周忠全
 */

public class BloodProp extends BaseProp{
    private int power = 10;

    public BloodProp(int locationX, int locationY, int speedX, int speedY, int power) {
        super(locationX, locationY, speedX, speedY);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
