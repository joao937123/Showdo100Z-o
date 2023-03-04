
import java.util.Scanner;

public class Visual {

	public static void mostrar(String text, int idade) {
		System.out.println(text);
		System.out.println("Idade: " + idade);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valorUsuario = sc.nextLine();
		mostrar("oi", 10);
		mostrar(valorUsuario, 98);
		
		sc.close();

	}

}
