
package com.caseih;

import java.util.Scanner;

public class ArabicNumbers {
	private int x;
	private int y;
	protected int result;
	private char operator;

	Scanner scanner = new Scanner(System.in);

	public void calculate() {
		setX();
		setY();
		setOperation();
		System.out.println("Результат: " + result);
	}

	/*
	 * Метод для считывания значений переменных Если считываеться целое
	 * число, значение присваиваеться переменной, иначе выводиться сообщение об
	 * ошибке и ввод нужно повторить.(используется рекурсия)
	 */
	private int setX() {
		System.out.println("Введите первое число");
		if (scanner.hasNextInt()) {
			x = scanner.nextInt();
		} else {
			System.out.println("Введите целое число");
			scanner.next();
			x = setX();

		}
		return x;
	}

	private int setY() {
		System.out.println("Введите второе число");
		if (scanner.hasNextInt()) {
			y = scanner.nextInt();
		} else {
			System.out.println("Введите целое число");
			scanner.next();
			y = setY();

		}
		return y;
	}

	/*
	 * Для вычисления используетсья оператор switch При введении не валидного
	 * символа, выводиться сообщение об ошибке и запускаеться рекурсия
	 */
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

}
