package chap5;

import java.util.Arrays;
import java.util.Random;

public class StudentScore {

	public static void main(String[] args) {
		Random rd = new Random();
		//5행 10열 배열 score선언 및 생성
		int [][] scores  = new int[5][10];
		//배열 각 요소에 0~100사이 난수 생성해 저장
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j<scores[i].length; j++) {
				scores[i][j]= rd.nextInt(101);
			}
		}
		System.out.println("학생의 점수");
		//학생의 점수 출력
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i+1)+ "반: ");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.printf("%4d", scores[i][j] );
			}
			System.out.println();
		}
		System.out.println("각 반 최고 점수");
		for(int i = 0 ; i < scores.length; i++) {
			Arrays.sort(scores[i]);
			//각 반의 마지막 요소 출력
			System.out.println((i+1)+"반: "+scores[i][scores[i].length-1]);
		}
	
	}

}
