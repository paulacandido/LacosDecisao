import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro numero:");
		a = input.nextInt();
		System.out.println("Digite o segundo numero:");
		b = input.nextInt();
		System.out.println("Digite o terceiro numero:");
		c = input.nextInt();
		
		if(a>b && a>c ) {
			System.out.println("O maior numero:"+a);
		}else if(b>c) {
			System.out.println("O maior numero:"+b);
		}else {
			System.out.println("O maior numero:"+c);
		}
		 

	}

}
