package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		/*
		 * ScoreVO �迭�� 5�� �����ϰ� Ű����κ��� 5�� �л��� �й�,����,����,���� ������ �Է¹ް� �� �迭�� ������ �� ����Ʈ��
		 * toString()���� ���̽ÿ�
		 */

		ScoreVO[] sVO = new ScoreVO[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sVO.length; i++) {
			sVO[i] = new ScoreVO();

			System.out.print("�й� > ");
			String strNum = scan.nextLine();

			System.out.print("�������� >");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.print("�������� >");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.print("�������� >");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);
			
//			sVO[i] = new ScoreVO();
			sVO[i].setNumber(strNum);
			sVO[i].setKor(intKor);
			sVO[i].setEng(intEng);
			sVO[i].setMath(intMath);

			System.out.println(sVO[i].toString());

		}

	}

}
