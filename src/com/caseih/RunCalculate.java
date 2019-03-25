package com.caseih;

import java.util.Scanner;

public class RunCalculate {
	
	Scanner scanner = new Scanner(System.in);
	
	public void runCalculate() {
		System.out.println("Для запуска калькулятора арабских, чисел нажмите \"А\",для римских, чисел нажмите \"R\" ");
		System.out.println("(ввод выполнять английскими символами)");
		
		char choice = scanner.next().charAt(0);
		choice = Character.toUpperCase(choice);
		switch(choice){
		case 'A':
			ArabicNumbers arabicNumbers = new ArabicNumbers();
			arabicNumbers.calculate();
			break;
		case 'R':
			RomanNumbers romanNumbers = new RomanNumbers();
			romanNumbers.romanCalc();
			break;
		default:
			System.out.println("Повторите ввод ");
			runCalculate();
			break;
		}
		System.out.println("Продолжить вычисления Y/N?");
		
		char closeOrRestart = scanner.next().charAt(0);
		closeOrRestart = Character.toUpperCase(closeOrRestart);
		switch(closeOrRestart){
		case 'Y':
			runCalculate();
			break;
		case 'N':
			scanner.close();
			break;
		}
		
	}
	
}
