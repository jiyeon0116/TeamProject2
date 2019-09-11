package base;
import myInterface.Shape;
/**
 * 원의 위치와 반지름을 받아 원을 그리고 넓이를 알려주는 클래스
 *`
 * @author (2018315036 양유석 , 2018315030 이가영 , 2018315022 이지연)
 * @version (19.09.10)
 */
public class Circle implements Shape
{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }

    public double getArea(){
        return radius*radius*PI;
    }

    public boolean equals(Circle cir ){
        if(this.x == cir.x && this.y == cir.y){
            return true;
        }
        else
            return false;
    }
}  