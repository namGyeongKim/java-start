package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10); //引数（ひきすう）
        System.out.println("결과1 출력: " + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    //add메서드//関数名（かんすうめい）//パラメータ
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + "연산 수행");
        int sum = a + b;
        return sum;//戻り値（もどりち）
    }
}
