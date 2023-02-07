package bridgelabz;
//import java.util.Scanner;
public class TicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] a = new char[10];
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
        
        display(a);
	}
	
	public static void display(char[] a) {
		
		for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
		}
	}


