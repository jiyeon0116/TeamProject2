package myInterface;

/**
 * 도형의 면적을 구해주는 interface.
 *
 * @author (2018315036 양유석 , 2018315030 이가영 , 2018315022 이지연)
 * @version (19.09.10)
 */
public interface Shape 
{
    final double PI = 3.14; //상수
    void draw(); //추상메소드
    double getArea();
    default public void redraw()
    {
         System.out.print("--- 다시 그립니다. ");
         draw();
    }
    
}

