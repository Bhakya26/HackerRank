import java.io.*;
import java.util.*;
class SuperClass{
    void display(){
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}
class ChildClass extends SuperClass{
    ChildClass(){
    super.display();
    System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
}
}
public class Super{

    public static void main(String[] args) {
        ChildClass obj=new ChildClass();
        
    }
    
}
