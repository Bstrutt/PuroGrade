package frictionlabs;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of linked boulder problems, \npress enter when finished.");

		int numBoulders = sc.nextInt();
		int[] vGrades = new int[numBoulders];

		System.out.println("Enter the difficulty of each problem");
		for (int i = 0; i < numBoulders; i++) {
			vGrades[i] = sc.nextInt();
		}

		int puroGrade = vCalculate(vGrades, vGrades.length - 1);

		for (int i = 0; i < vGrades.length; i++) {
			puroGrade = Math.max(puroGrade, vGrades[i]);
		}
		System.out.println("Your new grade is : " + puroGrade);
	}

	static int vCalculate(int[] a, int i) {
		int totalGrade;
		int prevGrade = a[i - 1];
		if (i > 1) {
			prevGrade = vCalculate(a, i - 1);
		}
		totalGrade = (prevGrade + a[i] + 3) / 2;

		return totalGrade;
	}
}