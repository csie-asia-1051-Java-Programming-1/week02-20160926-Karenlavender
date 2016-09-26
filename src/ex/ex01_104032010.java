package ex;

//TODO Auto-generated method stub
import java.util.Scanner;

public class ex01_104032010 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float p = (float) 0.5;
		float d = 0;
		if (n <= 600) {
			d = n * p;
		} else {
			if (n <= 1200) {
				d = (float) (n * p * 0.9);
			} else {
				d = (float) (n * p * 0.79);
			}
			
		}
		System.out.println(d);
	}

}
