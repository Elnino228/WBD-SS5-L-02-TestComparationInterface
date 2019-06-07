import shape.*;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparationInterface {
    public static void main(String[] args) {
        //test CircleComparator
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3.6);
        circles[1]=new Circle();
        circles[2]=new Circle(3.5,"indigo",false);

        System.out.println("Pre-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        //test RectangleComparator
        Rectangle[] rectangles=new Rectangle[3];
        rectangles[0]=new Rectangle(2.0,3.0);
        rectangles[1]=new Rectangle();
        rectangles[2]=new Rectangle(3.5,3.0,"indigo",false);

        System.out.println("Pre-sorted");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        Comparator rectangleComparator=new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);
        System.out.println("After-sorted");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        //test SquareComparator
        Square[] squares=new Square[3];
        squares[0]=new Square(3.0);
        squares[1]=new Square();
        squares[2]=new Square(2.0,"indigo",false);

        System.out.println("Pre-sorted");
        for (Square square:squares){
            System.out.println(square);
        }

        Comparator squareComparator=new SquareComparator();
        Arrays.sort(squares,squareComparator);
        System.out.println("After-sorted");
        for (Square square:squares){
            System.out.println(square);
        }
    }
}
