package array.ex;

import java.util.Scanner;

public class ArrayEx7Try1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        int[] total = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + "점수:");
                scores[i][j] = scanner.nextInt();
                total[i] += scores[i][j];
            }
        }

        for (int i = 0; i < total.length; i++) {
            double average = (double) total[i] / scores[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + total[i] + ", 평균: " + average);
        }


    }
}
