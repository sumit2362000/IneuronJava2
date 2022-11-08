package GuesserNumberAssignment3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Guesser {
	int GuessNum;

	// sir if we don't use random then it will not be fun as player (user) already
	// know the number
	public int guessNumber() throws InterruptedException {
		System.out.println("The Number is between 1 to 100");
		int seconds = 10;
		while (seconds >= 0) {
			System.out.println("Starting The GAME in " + seconds + " seconds.....");
//            I searched on Google on how to make delay in run of java and found this
			TimeUnit.SECONDS.sleep(1);
			seconds--;
		}
		GuessNum = (int) (Math.random() * 100);
		return GuessNum;
	}
}

class Player {
	int GuessNum;

	Scanner sc = new Scanner(System.in);

	public int guessNumber() {

		GuessNum = sc.nextInt();
		return GuessNum;
	}
}

class Umpire {
	int numfromGuesser;
	int numfromPlayer1;
	int numfromplayer2;
	int numfromplayer3;
	boolean retry;

	public void CollectNumFromGuesser() throws InterruptedException {
		Guesser g = new Guesser();
		numfromGuesser = g.guessNumber();

	}

	public void collectNumfromPlayer() {
		Player p1 = new Player(), p2 = new Player(), p3 = new Player();
		System.out.println("Player 1 guess the number :");
		numfromPlayer1 = p1.guessNumber();
		System.out.println("Player 2 guess the number :");
		numfromplayer2 = p2.guessNumber();
		System.out.println("Player 3 guess the number :");
		numfromplayer3 = p3.guessNumber();
	}

	void compare() {
		if (numfromGuesser == numfromPlayer1) {
			System.out.println("Player 1 win the game");
		} else if (numfromGuesser == numfromplayer2) {
			System.out.println("player 2 win the game ");
		} else if (numfromGuesser == numfromplayer3) {
			System.out.println("player 3 win the game ");
		} else {
			System.out.println("Game Lost TRY again !!! " + "\nBetter Luck next Time!!!" + "s\n the number was :"
					+ numfromGuesser);
		}
		System.out.println("Do you want to try again ? \n 1.YES  \t 2.NO");
		Scanner scan = new Scanner(System.in);
		int decide = scan.nextInt();
		if (decide == 1) {
			System.out.println("Ok Restarting Game ......");
			retry = true;
		} else if (decide == 2) {
			System.out.println("Exiting Game ......");
			retry = false;
		}
	}
}

public class GuessNumber {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("************* Wel-Come To The Number Guessing Game**************");
		char Starter;

		System.out.println("Press key 's' to start .......");
		Scanner scan = new Scanner(System.in);
		Starter = scan.next().charAt(0);
		int key = Starter;
		if (key == 115) {
			Umpire u1 = new Umpire();
			do {
				u1.CollectNumFromGuesser();
				u1.collectNumfromPlayer();
				u1.compare();
			} while (u1.retry);

		}
	}
}