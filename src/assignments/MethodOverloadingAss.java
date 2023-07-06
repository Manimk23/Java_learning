package assignments;

class sub {
    int a, b, result;

    void subtract(int a, int b) {
        result = a - b;
        System.out.println("Subtraction for the two numbers is " + result);
    }

    void subtract(int a, int b, int c) {
        result = a - b - c;
        System.out.println("Subtraction for the three numbers is " + result);
    }
}

public class MethodOverloadingAss {
    public static void main(String[] args) {
        sub obj = new sub();
        obj.subtract(20, 10);
        obj.subtract(10, 5, 5);
    }
}
