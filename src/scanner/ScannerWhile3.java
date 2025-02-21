package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 0을 입력하면 종료된다.");
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("입력한 모든 정수의 합: " + sum);
                break;
            }
            sum += num;
        }
    }
}
