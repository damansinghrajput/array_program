package test.com;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PassFail {

	private String name;
	private int[] marks;

	PassFail(String name, int... values) {
		this.name = name;
		this.marks = values;
	}

	private int getNumberofMarks() {

		return marks.length;
	}

	private void getTotalMark() {
		int sum = 0;
		int lessMarks = 23;
		int totalFailSubject = 0;
		for (int mark : marks) {
			if (mark < lessMarks) {
				totalFailSubject++;

			}

			sum += mark;
		}

		if (totalFailSubject > 0) {
			System.out.println(" You Are Fail in this Exam ");
		} else {

			System.out.println(" You Are Pass in this Exam: " + name);
			System.out.println("Total Obtained Marks " + sum);
			BigDecimal average = getAverageMarks(sum);
			System.out.println("Percentage : " + average);
		}

	}

	private BigDecimal getAverageMarks(int sum) {
		int number = getNumberofMarks();
		return (new BigDecimal(sum).divide(new BigDecimal(number * 70), 3, RoundingMode.UP))
				.multiply(new BigDecimal(100));
	}

	public static void main(String[] args) {
		PassFail student = new PassFail("daman", 56, 59, 32, 30, 20);

		student.getTotalMark();

	}

}
