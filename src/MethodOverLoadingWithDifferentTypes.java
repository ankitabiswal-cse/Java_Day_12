class Printer{
    void print(int number){
        System.out.println("Integer :"+number);
    }
    void print(double number){
        System.out.println("Double :"+number);
    }
    void print(String text){
        System.out.println("Name :"+text);
    }
}
public class MethodOverLoadingWithDifferentTypes {
    public static void main(String[] args){
        Printer p = new Printer();
        p.print(90);
        p.print(78.98);
        p.print("Ankita Biswal");
    }
}
