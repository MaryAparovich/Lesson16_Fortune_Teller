package by.htp.collections.input;

import java.util.Scanner;

public class Input {
	static Scanner mysc = new Scanner(System.in);

	public static int enterDivinationNumber() {
		System.out.print("������� �����: ");
		int numberOne = mysc.nextInt();
		return numberOne;
	}

	public static boolean askForFortune() {
		System.out.print("��������� ������� ? (1/0)");
		System.err.println();
		int answer = mysc.nextInt();
		if (answer == 1) {
			return true;
		} else if (answer == 0) {
			return false;
		} else {
			System.out.println("�������� ���� !");
			return askForFortune();
		}
	}
}
