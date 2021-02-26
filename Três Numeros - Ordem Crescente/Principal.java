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
		
		if(a<b && a<c ) {
			if(b<c) {
			System.out.println(a+"-"+b+"-"+c);
			}else {
				System.out.println(a+"-"+c+"-"+b);
			}				
		}else if(b<c) {
			if(a<c) {
				System.out.println(b+"-"+a+"-"+c);
				}else {
					System.out.println(b+"-"+c+"-"+a);
				}
		}else {
			if(b<a) {
				System.out.println(c+"-"+b+"-"+a);
				}else {
					System.out.println(c+"-"+a+"-"+b);
				}
		}
		 

		

	}

}
