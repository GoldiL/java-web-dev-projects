import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        System.out.println("Area of the circle"+ getArea(radius));


    }

    public static Double getArea(Double radius) {
        //double pi = 3.14;
        return Math.PI * radius * radius;
    }
}
