package com.data.structure.string.v2;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 1;
		System.out.println((i++));
		//System.out.println(reverse(-2147483412));;
	}

    public static int reverse(int x) {
		int quotient = x;
		int remainder = 0;
		int newNumber = 0;
		do {
			remainder = quotient % 10;
			quotient = quotient / 10;
			if (newNumber > Integer.MAX_VALUE/10 || (newNumber == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (newNumber < Integer.MIN_VALUE/10 || (newNumber == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
			newNumber = newNumber * 10 + remainder;
		} while (quotient != 0);

		return newNumber;
    }
}
