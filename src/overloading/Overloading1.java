package overloading;
//オーバーロード　同じ名前のメソッドを複数作ること
public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b; //リターン値が何かと関わる場合はreturnする。　この場合文字列とプラスする。
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }


}
