package day02;

import java.util.Scanner;

public class ex05삼항연산자 {

	public static void main(String[] args) {
		// 농구공담기.  하나의상자엔 5개
	Scanner sc = new Scanner(System.in);
	
	System.out.print("농구공의 개수를 입력하세요 : ");
	
	int ball = sc.nextInt();
	
	int box = (ball/5);
	
	System.out.print((ball%5>0 ? "필요한 상자의 수 : " + (box+1) : "필요한 상자의 수 : " + (box)));
	
	
	
	
	
	
	}

}
