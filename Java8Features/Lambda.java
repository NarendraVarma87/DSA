package Java8Features;

interface Features {
    void meth();

    public static void meth2() {
        System.out.println("Normal Method Calling...");
    }
}

public class Lambda {
    public static void main(String[] args) {
        Features one = () -> {
            System.out.println("first one calling...:");
        };
        one.meth();
        Features two = () -> {
            System.out.println("second one calling...");
        };
        two.meth();
        Features.meth2();
    }
}
