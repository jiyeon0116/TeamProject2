package main;
import base.Circle;

/**
 * 같은원 OR 다른원인지 판단하는 Method.
 *
 * @author (2018315036 양유석 , 2018315030 이가영 , 2018315022 이지연)
 * @version (19.09.10)
 */
public class MyApp{
    public static void main(String[] args){
        Circle c1 = new Circle(2, 3, 5);
        Circle c2 = new Circle(2, 3, 10);
        System.out.println("원1 : " + c1);
        System.out.println("원2 : " + c2);
        if(c1.equals(c2))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
