package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        if (grade == 1) {
            System.out.println("발급받은 쿠폰 " + 1000);
        } else if (grade == 2) {
            System.out.println("발급받은 쿠폰 " + 2000);
        } else  {
            System.out.println("발급받은 쿠폰 " + 3000);
        }
    }
}
