package Java8Features;

/*method reference is used to refer method of the functional interface.
It is compact and easy form of a lambda expression.
4 types of method reference 
1. Class::StaticMethodName  />for static method 
2. Object::instanceMethodName /> for particular object
3. Class :: instanceMethodName /> for instace method
4. ClassName :: new /> referance to constructor
*/
interface Test {
    void check1(String msg);
}

public class MethodReferance {
    public static void main(String[] args) {
        // lambda expression
        Test tss = (msg) -> {
            System.out.println("Lambda Calling...");
        };
        tss.check1(null);
        // method Referance
        Test ts = System.out::println;
        ts.check1("Method Referance Calling...");
    }
}
