// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 3

import java.util.Scanner;
import java.util.Random;

public class CAI2
{
	// Contains the program logic.
	public static void quiz()
	{
		Random secureRandom = new Random();
		int randInt1 = secureRandom.nextInt(10);
		int randInt2 = secureRandom.nextInt(10);

		askQuestion(randInt1, randInt2);
		int answer = (randInt1 * randInt2);
		readResponse(answer);
	}

	// Prints the problem to the screen.
	public static void askQuestion(int randInt1, int randInt2)
	{
		System.out.println("How much is " + randInt1 + " times " + randInt2 + " ?");
	}

	// Reads the answer from the student.
	public static void readResponse(int answer)
	{
		System.out.print("Answer: ");
		Scanner request = new Scanner(System.in);
		int response = request.nextInt();
		isAnswerCorrect(answer, response);
	}

	// Checks to see if student's answer matches the correct answer.
	public static void isAnswerCorrect(int answer, int response)
	{
		int studentAnswer = response;
		if(studentAnswer == answer)
		{
			displayCorrectResponse();
		}
		else
		{
			displayIncorrectResponse();
			readResponse(answer);
		}
	}

	// Prints out the response when a student enters a correct answer.
	public static void displayCorrectResponse()
	{
		int max = 4;
		int min = 1;
		int randNum = (int)(Math.random() * ((max - min) + 1) + min);
		System.out.println(randNum);

		switch (randNum)
		{
			case 1:
				System.out.println("Very good!");
				break;

			case 2:
				System.out.println("Excellent!");
				break;

			case 3:
				System.out.println("Nice Work!");
				break;

			case 4:
				System.out.println("Keep up the good work!");
				break;
		}
	}

	// Prints out the response when a student enters an incorrect answer.
	public static void displayIncorrectResponse()
	{
		int max = 4;
		int min = 1;
		int randNum = (int)(Math.random() * ((max - min) + 1) + min);
		System.out.println(randNum);

		switch (randNum)
		{
			case 1:
				System.out.println("No. Please try again.");
				break;

			case 2:
				System.out.println("Wrong. Try once more.");
				break;

			case 3:
				System.out.println("Don't give up!");
				break;

			case 4:
				System.out.println("No. Keep trying.");
				break;
		}
	}

	public static void main (String args[])
	{
		quiz();
	}
}
