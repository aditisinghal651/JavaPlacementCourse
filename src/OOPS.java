//creating classes- Pen & Student
class Pen{
    String color;
    String type; //ballpoint; gel, etc.

    //create a method in the class
    public void write(){
        System.out.println("Writing Something");
    }

    //create method to print the data assigned in the object
    public void printColor(){
        System.out.println(this.color); //"this" is a keyword of java that tells the function which object is calling it
    }

    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*
    Non-parameterized constructor
    Student(){
    System.out.println("Constructor Called!!");
    }
    */


    //Parameterized Constructor
    /*
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    */

    //Copy Constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}
public class OOPS {
    public static void main(String args[]){

        // creating an object
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Gel";

        pen1.write();
        pen1.printColor();
        pen1.printType();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ballpoint";

        pen2.write();
        pen2.printColor();
        pen2.printType();

        //Student s1 = new Student("Aditi", 21);
        Student s1 = new Student();
        s1.name = "Aditi";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
