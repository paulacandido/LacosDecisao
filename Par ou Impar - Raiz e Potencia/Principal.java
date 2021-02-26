import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Digite o numero:");
		num = input.nextInt();
		if(num%2 == 0) {
			System.out.println("É par."+(int)Math.sqrt(num));
		}else {
			System.out.println("É impar."+  (int)Math.pow(num,2));
		}

	}

}
