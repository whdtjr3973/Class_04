package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_01 {

	public static void main(String[] args) {
		
		/*
		 * ScoreVO Ŭ������ �̿��� sVO ��ü�� �����ϰ�
		 * Ű���忡�� �й�, �̸�, ����, ����, ���� ������
		 * ���� �Է¹ް� sVO ��ü�� �� �ʵ忡 ����(����)�ϰ�
		 * ����� ���� �ֿܼ� ���̽ÿ� 
		 */
		
		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�й�>");
		String strNum = scan.nextLine();
		
		System.out.println("�̸�(����) >");
		String strName = scan.nextLine();
		
		System.out.println("�������� >");
		String strKor = scan.nextLine();
		int intKor = Integer.valueOf(strKor);
		
		System.out.println("�������� >");
		String strEng = scan.nextLine();
		int intEng = Integer.valueOf(strEng);
		
		System.out.println("�������� >");
		String strMath = scan.nextLine();
		int intMath = Integer.valueOf(strMath);
		
		sVO.setNumber(strNum);
		sVO.setName(strName);
		sVO.setKor(intKor);
		sVO.setEng(intEng);
		sVO.setMath(intMath);
		
		
		System.out.println(sVO.toString());
	}
	
}
