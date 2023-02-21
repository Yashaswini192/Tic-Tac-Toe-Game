package bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static String[] a = new String[10];
	static String  playLetter = null;
	static  Scanner s = new Scanner(System.in);
	static int toss = 0;
	static int stop = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UC1();
		UC2();
		toss = UC6();
		if(toss == 1) {
			System.out.println("You won the toss \nmake 1st move");
			UC4();
		}else{
			System.out.println("you Lost the toss Computer will make 1st move");
		}
		  while(stop ==0) {
	            UC4();
	            UC7();
	        }

	}


	public static void UC1(){

		for(int i = 1; i< a.length; i++){
			a[i] = String.valueOf(i);
		}
	}

	public static void UC2() {

		System.out.println("Please choose your letter for playing (X or O) \ntype letter & press enter");
		playLetter = s.next();
		if(playLetter.equals("x") ){
			System.out.println("You choose X \nnow computer will play with O");
		} else if(playLetter.equals("o")){
			System.out.println("You choose O \nnow computer will play with X");
		}else{
			System.out.println("Invalid Input \n");
			UC2();
		}

	}


	public static void UC3ShowBoard () {

		System.out.println("TIC-TAC-TOE-GAME:");
		System.out.println(" " + (a[1]) + " | " + (a[2]) + " | " + (a[3]) + " ");
		System.out.println("-----------");
		System.out.println(" " + (a[4]) + " | " + (a[5]) + " | " + (a[6]) + " ");
		System.out.println("-----------");
		System.out.println(" " + (a[7]) + " | " + (a[8]) + " | " + (a[9]) + " ");

	}

	public static void UC4(){
		System.out.println("");
		UC3ShowBoard();
		System.out.println("Enter a slot number to Enter "+playLetter);
		int input = s.nextInt();
		if(a[input].equals(String.valueOf(input))) {

			switch (input) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9:
				a[input] = playLetter;
			UC3ShowBoard();
			break;
			default:
				System.out.println("Invalid slot Number. please Enter valid slot Number");
				UC4();
				break;

			}
		} else{
			System.out.println("Slot already used");
			UC4();
		}
		UC4();
	}

	public static int UC6(){
		int toss = (int)((Math.random()*10) %2);
		return toss;

	}

	 public static void UC7(){
	        for (int i = 0; i < 8; i++) {
	            String line = null;

	            switch (i) {
	                case 0:
	                    line = a[1] + a[2] + a[3];
	                    break;
	                case 1:
	                    line = a[4] + a[5] + a[6];
	                    break;
	                case 2:
	                    line = a[7] + a[8] + a[9];
	                    break;
	                case 3:
	                    line = a[1] + a[4] + a[7];
	                    break;
	                case 4:
	                    line = a[2] + a[5] + a[8];
	                    break;
	                case 5:
	                    line = a[3] + a[6] + a[9];
	                    break;
	                case 6:
	                    line = a[1] + a[5] + a[9];
	                    break;
	                case 7:
	                    line = a[3] + a[5] + a[7];
	                    break;
	            }
	            if (line.equals("xxx")) {
	                if(playLetter.equals("x")){
	                    System.out.println("you won the game");
	                    stop = 1;
	                } else{
	                    System.out.println("Computer won the game");
	                    stop = 1;
	                }

	            }else if (line.equals("ooo")) {
	                if(playLetter.equals("o")){
	                    System.out.println("you won the game");
	                    stop = 1;
	                } else{
	                    System.out.println("Computer won the game");
	                    stop = 1;
	                }

	            }
	        }

	    }
	
}





