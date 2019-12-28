package Algorithm;

import Algorithm.Position;
import Algorithm.Robot;

public class Robot_main{
    public static void main(String[] args){
        Robot robita = new Robot(new Position(10,20), "ロビタ");

        Robot robitaMkII = robita;

        System.out.println("移動前のrobita = " + robita);
        robita.moveX(10);
        System.out.println("移動前のrobita = " + robita);
        System.out.println("robitaMkII = " + robitaMkII);
    }
}
