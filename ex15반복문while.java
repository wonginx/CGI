package day02;

import java.util.Scanner;

public class ex15반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("A값 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("B값 입력 : ");
			int num2 = sc.nextInt();
			
			if(num1==0 && num2==0) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("결과 : " + (num1-num2));
			}
		
		}
		
			
	}
	

}
