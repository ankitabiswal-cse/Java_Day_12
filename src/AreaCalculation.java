class Area{
    int calculate(int side){
        return side*side;
    }
int calculate(int length,int breadth){
    return length*breadth;
}
double calculate(double radius){
        return 3.14 * radius * radius;
    }
}
public class AreaCalculation {
    public static void main(String[] args){
        Area a = new Area();

        System.out.println("Square ="+a.calculate(78));
        System.out.println("Rectangle ="+a.calculate(9,5));
        System.out.println("Circle = "+a.calculate(90.89));
    }
}
