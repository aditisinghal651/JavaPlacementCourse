
//Polymorphism- Function overloading/ compile time polymorphism
class Poly{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class OOPS2 {
    public static void main(String args[]){
        Poly p1 = new Poly();

        p1.printInfo("Aditi Singhal");
        p1.printInfo(20);
    }
}
