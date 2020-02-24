// Kaileyann Rodriguez
// COP 3330
// Programming Assignment 3

import java.util.Scanner;
import java.util.Random;

public class CAI4
{
	// Contains the program logic.
	public static void quiz()
	{
		readDifficulty();
	}

	public static void readDifficulty()
	{
		//Random difficulty = new Random();
		//int level = difficulty.nextInt(4);
		System.out.println("Level 1: Numbers range 0-9.");
		System.out.println("Level 2: Numbers range 0-99.");
		System.out.println("Level 3: Numbers range 0-999.");
		System.out.println("Level 4: Numbers range 0-9999.");
		System.out.println("Input level of difficulty preferred: ");
		Scanner difficulty= new Scanner(System.in);
		int level = difficulty.nextInt();
		generateQuestionArgument(level);
	}

	public static void generateQuestionArgument(int level)
	{
		int diffLevel = level;
		int num = 0;

		if(diffLevel == 1)
		{
			num = 10;
			askQuestion(num);
		}
		else if(diffLevel == 2)
		{
			num = 100;
			askQuestion(num);
		}
		else if(diffLevel == 3)
		{
			num = 1000;
			askQuestion(num);
		}
		else if(diffLevel == 4)
		{
			num = 10000;
			askQuestion(num);
		}
	}

	// Prints the problem to the screen.
	public static void askQuestion(int num)
	{
		generateQuestionArgument(num);
		for(int i = 1; i <= 10; i++)
		{
			Random secureRandom = new Random();
			int randInt1 = secureRandom.nextInt(num);
			int randInt2 = secureRandom.nextInt(num);
			System.out.println(i + ") How much is " + randInt1 + " times " + randInt2 + "?");
			int answer = (randInt1 * randInt2);
			readResponse(answer, i);
		}
	}

	// Reads the answer from the student.
	public static void readResponse(int answer, int i)
	{
		System.out.print("Answer: ");
		Scanner request = new Scanner(System.in);
		int response = request.nextInt();
		isAnswerCorrect(answer, response, i);
	}

	// Checks to see if student's answer matches the correct answer.
	public static void isAnswerCorrect(int answer, int response, int i)
	{
		int right = 0;
		int studentAnswer = response;
		if(studentAnswer == answer)
		{
			displayCorrectResponse();
			right++;
		}
		else
		{
			displayIncorrectResponse();
		}
		if(i == 10)
		{
			displayCompletionMessage(right);
		}
	}

	// Prints out the response when a student enters a correct answer.
	public static void displayCorrectResponse()
	{
		int max = 4;
		int min = 1;
		int randNum = (int)(Math.random() * ((max - min) + 1) + min);

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

	public static void displayCompletionMessage(int count)
	{
		int percentage = (count * 10);
		if(percentage < 75)
		{
			System.out.println("Please ask your teacher for extra help.");
			System.out.println();
		}
		else if(percentage >= 75)
		{
			System.out.println("Congradulations, you are ready to go to the next level!");
			System.out.println();
		}

		System.out.println("Would you like to solve a new problem set?");
		System.out.println("1) Yes or 2) No");
		Scanner again = new Scanner(System.in);
		int tryAgain = again.nextInt();

		if(tryAgain == 1)
		{
			quiz();
		}
	}

	public static void main (String args[])
	{
		quiz();
	}
}
