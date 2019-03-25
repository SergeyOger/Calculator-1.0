package com.caseih;

import java.util.Scanner;

public class RomanNumbers {
	private int x;
	private int y;
	private char operator;
	private int result;
	private String convertedNum;

	Scanner scanner = new Scanner(System.in);

	private String readNum;
	private int arabicNum;

	// Запуск калькулятора

	public void romanCalc() {

		setX();
		setY();
		decodeResult();

	}

	// Считывание первого числа

	private void setX() {

		System.out.println("Введите первое число");
		if (scanner.hasNextLine()) {

			arabicNum();

		}
		this.x = arabicNum;

	}

	// Считывание второго числа

	private void setY() {

		System.out.println("Введите второе число");
		if (scanner.hasNextLine()) {

			arabicNum();

		}
		this.y = arabicNum;

	}

	// Медод для распознавания ввода римских чисел, с переводом символов в верхний
	// регистр

	private int arabicNum() {
		readNum = scanner.nextLine();
		readNum = readNum.toUpperCase();

		switch (readNum) {

		case "I":
			arabicNum = 1;
			break;
		case "II":
			arabicNum = 2;
			break;
		case "III":
			arabicNum = 3;
			break;
		case "IV":
			arabicNum = 4;
			break;
		case "V":
			arabicNum = 5;
			break;
		case "VI":
			arabicNum = 6;
			break;
		case "VII":
			arabicNum = 7;
			break;
		case "VIII":
			arabicNum = 8;
			break;
		case "IX":
			arabicNum = 9;
			break;
		case "X":
			arabicNum = 10;
			break;
		default:
			System.out.println("Введите число римскими символами");
			arabicNum();
			break;
		}
		return arabicNum;

	}

	// Выбор оператора и выполнение аррифметических действий
	private int setOperation() {
		System.out.println("Введите оператор");
		operator = scanner.next().charAt(0);
		switch (operator) {
		case '/':
			result = x / y;

			break;

		case '*':
			result = x * y;
			break;

		case '+':
			result = x + y;
			break;

		case '-':
			result = x - y;
			break;

		default:
			System.out.println("Введён некорректный оператор,повторите ввод");
			result = setOperation();

		}
		return result;

	}

	// Конвертация арабских чисел в римские

	private void decodeResult() {

		setOperation();

		if (result <= 10) {
			converterToTen();
			System.out.println("Результат : " + convertedNum);

		} else if (result < 100) {

			char[] num = String.valueOf(result).toCharArray();
			
			result = Character.getNumericValue(num[0]);
			converterAfterTen();
			System.out.print("Результат : " + convertedNum);
			
			result = Character.getNumericValue(num[1]);
			converterToTen();
			System.out.print(convertedNum + "\n");

		} else {
			System.out.println("Результат: C ");
		}

	}

	// Конвертация арабских чисел в диапазоне 1-10
	private String converterToTen() {

		switch (result) {
		case 0:
			convertedNum = " ";
			break;
		case 1:
			convertedNum = "I";
			break;
		case 2:
			convertedNum = "II";
			break;
		case 3:
			convertedNum = "III";
			break;
		case 4:
			convertedNum = "IV";
			break;
		case 5:
			convertedNum = "V";
			break;
		case 6:
			convertedNum = "VI";
			break;
		case 7:
			convertedNum = "VII";
			break;
		case 8:
			convertedNum = "VIII";
			break;
		case 9:
			convertedNum = "IX";
			break;
		case 10:
			convertedNum = "X";
			break;
		}
		return convertedNum;

	}

	// Конвертация арабских чисел в диапазоне 11-99
	private String converterAfterTen() {

		switch (result) {
		case 0:
			convertedNum = " ";
			break;
		case 1:
			convertedNum = "X";
			break;
		case 2:
			convertedNum = "XX";
			break;
		case 3:
			convertedNum = "XXX";
			break;
		case 4:
			convertedNum = "XL";
			break;
		case 5:
			convertedNum = "L";
			break;
		case 6:
			convertedNum = "LX";
			break;
		case 7:
			convertedNum = "LXX";
			break;
		case 8:
			convertedNum = "LXXX";
			break;
		case 9:
			convertedNum = "XC";
			break;
		}
		return convertedNum;

	}

}
