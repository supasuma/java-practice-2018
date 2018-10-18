package com.example.practice;

public class Practice {
	public static void main(String[] args) {
		isLeapYear(1800);
	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			int divisableBy100 = year % 100;
			int divisableBy4 = year % 4;
			int divisableBy400 = year % 400;
			if ((divisableBy4 == 0 && divisableBy100 != 0) || divisableBy400 == 0) {
				System.out.println((divisableBy4 == 0 && divisableBy100 != 0));
				System.out.println(divisableBy400 != 0);
				return true;
			} else {
//				System.out.println(divisableBy400 == 0);
				return false;
			}
		} else {
			return false;
		}
	}


}
