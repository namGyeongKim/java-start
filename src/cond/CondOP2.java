package cond;

public class CondOP2 {

    public static void main(String[] agrs) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
