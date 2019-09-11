package base;

<<<<<<< HEAD
<<<<<<< HEAD
 /*
  * 
  * 
  * @author ((2018315036 양유석 , 2018315030 이가영 , 2018315022 이지연))
  * @version (a version number or a date)
  */
public class Circle implements Shape


=======
/*
 * 
 * 
 * @author ((2018315036 양유석 , 2018315030 이가영 , 2018315022 이지연))
 * @version (a version number or a date)
=======
/**
 * 생성자 생성 및 boolean 조건 작성
 *`
 * @author (2018315036 양유석 , 2018315030 이가영 , 2018315022 이지연)
 * @version (19.09.10)
>>>>>>> accf955550433aa8533af239690850bc41849d76
 */
public class Circle
>>>>>>> e813cdf49c2ddb4d34f1a2942fb57ccb535e478f
{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

<<<<<<< HEAD
<<<<<<< HEAD


    
    public void draw(){
    }
    public void redraw(){
    }
    public void getArea(){
    }


    public boolean equals(Circle cir ){
        if(){
            return true;
        }
        else
            return false;
    }
}   
=======
    public boolean equals(Circle cir ){
        if(){
            return true;
        }
        else
            return false;
    }
}   
>>>>>>> e813cdf49c2ddb4d34f1a2942fb57ccb535e478f
=======
    public boolean equals(Circle cir ){
        if(x== cir.x && y== cir.y){
            return true;
        }
        else
            return false;
    }
}   
>>>>>>> accf955550433aa8533af239690850bc41849d76
