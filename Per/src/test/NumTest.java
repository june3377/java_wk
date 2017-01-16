package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumTest {

	public static void main(String[] args) throws IOException {
		int in_n;
		boolean flag = true;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (flag) {
			System.out.println("숫자를 입력하세요");
			in_n = Integer.parseInt(in.readLine());
			switch (in_n) {
			case 1:
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;

			case 2:
				for (int i = 0; i < 5; i++) {
					for (int j = i; j < 5 - 1; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;

			case 3:
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print((j < i) ? " " : "*");
					}
					System.out.println();
				}
				break;

			case 4:
				for (int i = 0; i < 5; i++) {
					for (int j = i; j < 5; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
				
			default:
				System.out.println("종료되었습니다.");
				flag = false;
				break;
			}
		}
	}
}