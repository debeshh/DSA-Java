class Pen{
    String color;
    String type; //ballpoint, gel

    public void write(){
        System.out.println("Writing something ");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}



class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
    }

    public void printAge(){
        System.out.println(this.age);
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //NON PARAMETRIZED CONSTRUCTOR
    Student(){
        System.out.println("Constructor called");
    }

    //PARAMETRIZED CONSTRUCTOR
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //COPY CONSTRUCTOR
    Student(Student s3){
        this.name = s3.name;
        this.age = s3.age;
    }
}


public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();


        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";

        pen2.printColor();
        pen2.printType();

        Student s1 = new Student();
        s1.name = "Debesh Behera";
        s1.age = 20;
        Student s2 = new Student("Tenisa", 14);
        Student s3 = new Student("Kshirodiini",45);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}
