package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();//メソッド呼び出し（よびだし）
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() { //メソッド宣言（せんげん）
        System.out.println("= 프로그램을 시작합니다 =");
        return; //void의 경우 생략 가능
    }

    public static void printFooter() {//メソッド宣言（せんげん）
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
