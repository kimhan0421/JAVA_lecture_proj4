package chap5;

import java.util.Arrays;
import java.util.Random;

public class StudentScore {

	public static void main(String[] args) {
		Random rd = new Random();
		//5�� 10�� �迭 score���� �� ����
		int [][] scores  = new int[5][10];
		//�迭 �� ��ҿ� 0~100���� ���� ������ ����
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j<scores[i].length; j++) {
				scores[i][j]= rd.nextInt(101);
			}
		}
		System.out.println("�л��� ����");
		//�л��� ���� ���
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+ "��: ");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.printf("%4d", scores[i][j] );
			}
			System.out.println();
		}
		System.out.println("�� �� �ְ� ����");
		for(int i = 0 ; i < scores.length; i++) {
			Arrays.sort(scores[i]);
			//�� ���� ������ ��� ���
			System.out.println((i+1)+"��: "+scores[i][scores[i].length-1]);
		}
	
	}

}
