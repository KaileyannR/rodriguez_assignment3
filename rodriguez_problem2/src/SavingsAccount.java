// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 3

import java.util.Scanner;
public class SavingsAccount
{
	private static double annualInterestRate;
	private static double savingsBalance;

	public static void calculateMonthlyInterest()
	{
		savingsBalance = (savingsBalance * annualInterestRate) / 12;
	}

	public static void modifyInterestRate()
	{
		annualInterestRate = (savingsBalance * 12);
	}

	public static void main (String[] args)
	{
		// Savings Account Test
	}
}
