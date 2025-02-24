package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        average(sum, 3.0);

        sum = sum(15, 25, 35);
        average(sum, 3.0);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void average(int a, double c) {
        System.out.println("평균값: " + a / c);
    }
}
