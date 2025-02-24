package array.ex;

import java.util.Scanner;

public class ArrayEx8Try2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[studentCount][subjects.length];

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int[] total = new int[studentCount];
            for (int j = 0; j < subjects.length; j++) {
                total[i] += scores[i][j];
            }
            double average = (double)total[i] / studentCount;
            System.out.println((i + 1) + "번 학생의 총점: " + total[i] + ", 평균: " + average);
        }
    }
}
