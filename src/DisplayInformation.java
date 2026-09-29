class Information{
    void display(String name){
        System.out.println("Name :"+name);
    }
    void display(String name,int age){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
    void display(String name,int age,String branch){
        System.out.println("Name :"+name);
        System.out.println("Age:"+age);
        System.out.println("Branch:"+branch);
    }
}
public class DisplayInformation {
    public static void main(String[] args){
        Information i1 = new Information();

        i1.display("Ankita Biswal");
        i1.display("Ankita Biswal",19);
        i1.display("Ankita Biswal",19,"CSE");
    }
}
