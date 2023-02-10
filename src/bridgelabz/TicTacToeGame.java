package bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a = new char[10];

		showBoard(a);
		display(a);
		//chooseLetter(a);
		showBoard(a);
	}

	public static void display(char[] a) {
		Scanner s = new Scanner(System.in);
		//a[0]=0;
		a[1] = ' ';
		a[2] = ' ';
		a[3] = ' ';
		a[4] = ' ';
		a[5] = ' ';
		a[6] = ' ';
		a[7] = ' ';
		a[8] = ' ';
		a[9] = ' ';

		System.out.println("enter index number from 1 to 9:");
		String userinput = s.nextLine();

		switch(userinput) {
		case "1":
			System.out.print("enter X or O:");
			a[1] = s.next().charAt(0);
			break;
		case "2":
			System.out.print("enter X or O:");
			a[2] = s.next().charAt(0);;
			break;
		case "3":
			System.out.print("enter X or O:");
			a[3] = s.next().charAt(0);;
			break;
		case "4":
			System.out.print("enter X or O:");
			a[4] = s.next().charAt(0);;
			break;
		case "5":
			System.out.print("enter X or O:");
			a[5] = s.next().charAt(0);;
			break;
		case "6":
			System.out.print("enter X or O:");
			a[6] = s.next().charAt(0);;
			break;
		case "7":
			System.out.print("enter X or O:");
			a[7] = s.next().charAt(0);;
			break;
		case "8":
			System.out.print("enter X or O:");
			a[8] = s.next().charAt(0);;
			break;
		case "9":
			System.out.print("enter X or O:");
			a[9] = s.next().charAt(0);;
			break;
		default:
			System.out.println("enter the correct index number");
		}
		
	}

	/*public static void chooseLetter(char[] a) {

		Scanner t = new Scanner(System.in);
		char player;
		System.out.println("player enter X or O:");
		player = t.next().toUpperCase().charAt(0);
		if(player == 'X') 
		{
			System.out.println("computerplay:'O'");
		}
		else {
			System.out.println("computerplay:'X'");
		}
	}*/

	public static void showBoard (char a[]) {

		System.out.println("TIC-TAC-TOE-GAME:");
		System.out.println(" " + (a[1]) + " | " + (a[2]) + " | " + (a[3]) + " ");
		System.out.println("-----------");
		System.out.println(" " + (a[4]) + " | " + (a[5]) + " | " + (a[6]) + " ");
		System.out.println("-----------");
		System.out.println(" " + (a[7]) + " | " + (a[8]) + " | " + (a[9]) + " ");

	}

}




