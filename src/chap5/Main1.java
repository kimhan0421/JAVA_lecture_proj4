package chap5;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };

		while (true) {
			System.out.print("���� �ܾ �Է��ϼ��� >> ");
			String eWord = sc.next();

			if (eWord.equals("exit")) {
				System.out.print("�����մϴ�.");
				break;
			} else {
				for (int i = 0; i < eng.length; i++) {
					if (eWord.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					} else if (!eWord.equals(eng[i]) && i == 4) {
						System.out.println("�ܾ �����ϴ�.");
					}
				}
			}
		}
	}

}
