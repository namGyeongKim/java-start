package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int studentsCount = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] score = new int[studentsCount][subjects.length];

        int[] sum = new int[studentsCount];
        double[] average = new double[studentsCount];

        for (int i = 0; i < studentsCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
                sum[i] += score[i][j];
            }
            average[i] = (double) sum[i] / studentsCount;
        }

        for (int i = 0; i < studentsCount; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " + average[i]);
        }
    }
}
