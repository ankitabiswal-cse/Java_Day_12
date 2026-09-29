class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class CalculatorAddition {
    public static void main(String[] args){
        Calculator c = new Calculator();

        System.out.println(c.add(15,23));
        System.out.println(c.add(3,29,18));
        System.out.println(c.add(2007,2007));
    }
}
