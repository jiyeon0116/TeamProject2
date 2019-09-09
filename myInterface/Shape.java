package myInterface;
<<<<<<< HEAD


/**
 * Write a description of interface Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Shape
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    int sampleMethod(int y);
}
=======
/**
 * 도형의 면적을 구해주는 interface.
 *
 * @author (2018315036 양유석, 2018315030 이가영, 2018315022 이지연)
 * @version (2019.09.02)
 */
public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw()
    {
         System.out.print("--- 다시 그림니다. ");
         draw();
    }
}

>>>>>>> d00503793867461ec25092fb1cd4d4c4e2803571
