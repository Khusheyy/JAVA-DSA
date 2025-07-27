/*
 oops! in java
 every object follow the blue-print / prototype of its class
 constructor of a class has the same name as the class
 a constructor is used to create the object , it constructs (something)
 a constructor does not return anything , they are just like methods
 they can be called only "once" when : after the obj is created
  3types of constructors -> 1- non-parametrized (by default)
 2- parameterized
 3- copy constructors
*/

class Pen{
      String color;//stores color of the pen
      String type;// ballpoint pen / gel pen
  // this is a function , in class called - method()
    public void write(){
        System.out.println(this.type+" pen is writing for youuu");
    }

    public void display_color(){
        System.out.println(this.color);
        // here "this" keyword - refers to current object in a method
        //is function ko kisne call kiya h (konse object ne call kiya h ) - uska color batao/uska tyoe batao
    }

    public void display_type(){
        System.out.println(this.type);
    }

    Pen() {
        System.out.println("constuctor is called");
        //un parameterised constructor
    }
}

class Student{
    String name;
    int age;
    int roll_no;
    String subject_chosen;


    //polymorphism - same function diff/diff no.of parameters
    public void print_info(){
        System.out.println("heyy this person is person");
    }
    public void print_info(String name){
        System.out.println(name+" says you hiii!! welcome to my team");
    }
    public void print_info(String name,int roll_no){
        System.out.println(name+" says that their roll number is "+roll_no);
    }

//    public void display_info(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
//    Student(){
//        System.out.println("constructor was called here!");
//    }
//
    Student(String name,int roll){
        this.name = name;
        this.roll_no = roll;
    }
//
//    Student(Student s2){
//        this.name = s2.name;
//        this.age = s2.age;
//    }


}


class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("khushi",14);

        s1.print_info();
        s1.print_info("khushi");
        s1.print_info("khushi",56);
    }
}
//    public static void main(String[] args) {
//
//        // so this is main function where i'll create objects of class pen
//        Pen mypen = new Pen();
//        //creating obj "mypen" of class-pen
//
//        mypen.color = "blue";
//        mypen.type = "ball-point";
//
//        mypen.write();
//        mypen.display_color();
//        mypen.display_type();
//
//        Pen pen2 = new Pen();
//        pen2.type = "gel";
//        pen2.color = "black";
//
//        pen2.write();
//        pen2.display_color();
//        pen2.display_type();
//
//        Student s1 = new Student();
//        s1.name = "aman";
//        s1.age = 24;
//
//      Student s2 = new Student(s1);
//      // copy constructor , will mean -> s1.name , s1.age
//      s2.display_info();
//
//
////      Student s2 = new Student();
////      s2.name = "khushi";
////      s2.age = 17;
////
////      s1.display_info();
////      s2.display_info();
////
////      Student s3 = new Student("khushi",18);
////      s3.display_info();
//
//    }
//}