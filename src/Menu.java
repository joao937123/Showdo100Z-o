import java.util.Scanner;

public class Menu {
	public static void mostrarMenu() {
		
		System.out.println(".......... J O G O   D O   1 0 0 Z Ã O ..........");
		System.out.println("_________________\n");
		System.out.println("		| M E N U |				\n");
		System.out.println("Digite o número da opção que você deseja.\n");
		System.out.println("1 - Iniciar.");
		System.out.println("2 - Regras do jogo");
		System.out.println("0 - Sair.\n");

	}

	public static void iniciar() {

		Scanner sc = new Scanner(System.in);
		int resposta;

		do {
			
			mostrarMenu();
			resposta = sc.nextInt();

			switch (resposta) {
			case 0:
				System.out.println("Obrigado, até mais!!!");
				break;
			case 1:
				Questaoes.iniciar();
				break;
			case 2:
				Regras.mostrar();
				System.out.println(" 01 - Você receberá uma pergunta gerada pelo sistema");
				System.out.println(" 02 -Terá algumas alternativa , e somente  uma delas é a certa ");
				System.out.println(" 03 - Se você acertar a reposta da pergunta , você recebera um bônus por ter acertado a pergunta ");
				System.out.println(" 04- Caso erre , ira parar o jogo , então será não pode prosseguir jogando , só si começara de novo ");
				System.out.println(" BOA SORTE ");
				break;
			default:
				System.out.println("Valor digitado invalido");
			}
			
		} while (resposta != 0);

		sc.close();
	}
}
