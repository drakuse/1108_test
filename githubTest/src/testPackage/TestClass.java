package testPackage;

import java.util.Scanner;

public class TestClass {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean run = true;
		int[] student = null;
		int sum = 0;
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("학생수>");
				int studentNum = sc.nextInt();
				student = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "번 째 학생 점수 : ");
					student[i] = sc.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < student.length; i++) {
					System.out.println((i + 1) + "번 째 학생 점수 : " + student[i]);
				}
				break;
			case 4:
				int max = 0, min = 101;
				for (int st : student) {
					sum += st;
					if (max < st) {
						max = st;
					}
					if (min > st) {
						min = st;
					}
				}
				System.out.println("총점수 : " + sum);
				System.out.println("최고점 : " + max);
				System.out.println("최하점 : " + min);
				System.out.println("평균점수 : " + sum / student.length);
				break;
			case 5:
				System.out.println("시스템 종료");
				run = false;
				break;
			default:
				System.out.println("1~5의 번호를 입력하시오");
				break;
			}
		}
	}
}
