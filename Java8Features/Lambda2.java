package Java8Features;

interface Check {
    int addition(int num1, int num2);

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
}

public class Lambda2 {
    public static void main(String[] args) {
        Check add = (int num1, int num2) -> {
            return num1 + num2;
        };
        int result = add.addition(100, 50);
        System.out.println("sum of two numbers are :" + result);
        int result2 = Check.multiplication(5, 10);
        System.out.println("The multiplication of two numbers are :" + result2);
    }
}
