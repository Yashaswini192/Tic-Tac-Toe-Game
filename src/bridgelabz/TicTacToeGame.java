package bridgelabz;

import java.util.Scanner;
import java.util.*;

public class TicTacToeGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a = new char[10];
        display(a);
        chooseLetter(a);
      
    }
	
	public static void display(char[] a) {
		
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
        
		/*for( int i = 1; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.println();
			}*/
	}

	public static void chooseLetter(char[] a) {
		Scanner t = new Scanner(System.in);
		System.out.println("player enter 'X' or 'O':");
		char computer,player;
		player = t.next().toUpperCase().charAt(0);
		if(player == 'X') 
		{
		   System.out.println("computerplay:'O'");
		}
		else {
	       System.out.println("computerplay:'X'");
		}
	}	
}
	
	


