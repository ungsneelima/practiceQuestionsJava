package coding;


//public class SealedClassExample {
//    public static void main(String[] args) {
//        Object obj = 123;
//
//        String result = switch (obj) {
//            case String s -> "String value: " + s;
//            case Integer i when i > 100 -> "Large integer: " + i;
//            case Integer i -> "Small integer: " + i;
//            default -> "Unknown type";
//        };
//
//        System.out.println(result);
//    }
//}

class Parent {   
    String name;   
    
    // A method which prints the data of the parent class   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Child extends Parent {   
    int age;   
    
    // Performing overriding  
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class SealedClassExample{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Shubham";  
          
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Child c = (Child)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }   
}  