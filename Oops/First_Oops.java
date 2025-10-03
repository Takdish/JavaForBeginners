package Oops; 
class Pen{ 
    
    String colour;
    String type; //ball pen, jell pen 

     public void write(){
        System.out.println("Writting something");
     }
} 
class twelve{ 
    String subjects;   
    public void sub(){
        System.out.print("Maths, " + "Physics, " + "Chemistry, " + "Cs, " + "English");
    }
}

public class First_Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); 
        pen1.colour="blue";
        pen1.type="jell"; 

        pen1.write(); 
        twelve subs = new twelve();
        subs.subjects = "maths";
        subs.subjects = "Cse"; 
         
        subs.subjects
    }
}
