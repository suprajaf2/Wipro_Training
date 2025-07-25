package day6;
interface MyInterface {
//Abstract method (implicitly public and abstract)
void abstractMethod();

// Default method 
default void defaultMethod() {
    System.out.println("Default method in interface");
}

// Static method 
static void staticMethod() {
    System.out.println("Static method in interface");
}

int Num = 100;
static final String Name = "InterfaceDemo";
}

public class DefaultStaticFinal implements MyInterface {

// Must implement the abstract method
@Override
public void abstractMethod() {
    System.out.println("Implemented abstract method in class");
    
}
@Override
public  void defaultMethod() {
    System.out.println("Default method in class");
}

public static void main(String[] args) {
	DefaultStaticFinal obj = new DefaultStaticFinal();

    // Calling abstract method implementation
    obj.abstractMethod();

    // Calling default method from interface
    obj.defaultMethod();

    // Calling static method from interface using interface name
    MyInterface.staticMethod();

    // Accessing final static variables
    System.out.println("Max Value: " + MyInterface.Num);
    System.out.println("App Name: " + MyInterface.Name);
    //MyInterface.Num=200;
    //MyInterface.Name="New App";
    
}
}