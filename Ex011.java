package listaFor;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, n, t;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o numero");
			n = in.nextInt();
			t = n * i;
			System.out.println(t);
			}
		
		

	}

}
