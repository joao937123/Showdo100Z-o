
import java.util.Random;
import java.util.Scanner;

public class Questaoes {

	static Scanner sc = new Scanner(System.in);

	public static void mostrarPergunta(Pergunta pergunta) {

		System.out.println(pergunta.frase);
		System.out.println(pergunta.alternativaA);
		System.out.println(pergunta.alternativaB);
		System.out.println(pergunta.alternativaC);
		System.out.println(pergunta.alternativaD);

	}

	public static boolean verificarResposta(Pergunta pergunta) {

		String respostaEscolhida = sc.nextLine();

		if (respostaEscolhida.equals(pergunta.respostaCorreta)) {
			System.out.println("Parabéns, você acertou , você é bom mesmo :)\n");
			return false;
		} else {
			System.out.println("\n   VOCÊ ERROU A PERGUNTA !!! \n");
			return false;

		}

	}

	public static void iniciar() {

		double premio = new Random().nextDouble(0.5, 3);

		Pergunta pergunta1 = new Pergunta();
		pergunta1.frase = "............. P E R G U N T A  01 .............\n\nQual pais estão em guerra em 2022 ?\n";
		pergunta1.alternativaA = "a) França e Venezuela";
		pergunta1.alternativaB = "b) Inglaterra e Estados Unidos";
		pergunta1.alternativaC = "c) Russia e Ucrania";
		pergunta1.alternativaD = "d) Austrália e Iran ";
		pergunta1.respostaCorreta = "c";

		mostrarPergunta(pergunta1);
		verificarResposta(pergunta1);

		System.out.println("Deseja continuar?\n0 - Não e 1 - Sim");
		int resposta = Integer.parseInt(sc.nextLine());
		if (resposta == 1) {
			double premioFinalParticipante = premio;
			System.out.println("Vc ganhou: R$ " + String.format("%1$,.2f", premioFinalParticipante));
		} else {
			System.out.println("Digite o número de uma das opções!");
		}

		Pergunta pergunta2 = new Pergunta();
		pergunta2.frase = "............. P E R G U N T A  02 .............\n\nQuem é dono da Apple ?\n";
		pergunta2.alternativaA = "a) Elvis Presley ";
		pergunta2.alternativaB = "b) Martin Cooper ";
		pergunta2.alternativaC = "c) Bill Gates ";
		pergunta2.alternativaD = "d) Steve Jobs";
		pergunta2.respostaCorreta = "d";

		mostrarPergunta(pergunta2);
		verificarResposta(pergunta2);

		Pergunta pergunta3 = new Pergunta();
		pergunta3.frase = "............. P E R G U N T A  03 .............\n\nQual noeda é usada no Estados Unidos  ?\n";
		pergunta3.alternativaA = "a) Cruzeiro";
		pergunta3.alternativaB = "b) Euro ";
		pergunta3.alternativaC = "c) Real ";
		pergunta3.alternativaD = "d) Dollar ";
		pergunta3.respostaCorreta = "d";

		mostrarPergunta(pergunta3);
		verificarResposta(pergunta3);

		Pergunta pergunta4 = new Pergunta();
		pergunta4.frase = "............. P E R G U N T A  04 .............\n\nQual é o sistema mais seguro ?\n";
		pergunta4.alternativaA = "a) World";
		pergunta4.alternativaB = "b) Linux";
		pergunta4.alternativaC = "c) Apple ";
		pergunta4.alternativaD = "d) Windonws";
		pergunta4.respostaCorreta = "c";

		mostrarPergunta(pergunta4);
		verificarResposta(pergunta4);

		Pergunta pergunta5 = new Pergunta();
		pergunta5.frase = "............. P E R G U N T A  05 .............\n Dia 8 de março é dia internacional do que ...\n";
		pergunta5.alternativaA = "a) Das crianças ";
		pergunta5.alternativaB = "b) Das mulheres ";
		pergunta5.alternativaC = "c) Obesidade ";
		pergunta5.alternativaD = "d) Dos namorados ";
		pergunta5.respostaCorreta = "b";

		mostrarPergunta(pergunta5);
		verificarResposta(pergunta5);

		Pergunta pergunta6 = new Pergunta();
		pergunta6.frase = "............. P E R G U N T A  06 .............\nQual é o trio de jogadores que estão no time da Psg ?\n";
		pergunta6.alternativaA = "a) Messi , lukaku , Haaland";
		pergunta6.alternativaB = "b) Phelipe coutinho , Gabigol , Calerri  ";
		pergunta6.alternativaC = "c) Neymar , Messi , Mbappé ";
		pergunta6.alternativaD = "d) Neymar , Cristiano Ronaldo , Vini jr";
		pergunta6.respostaCorreta = "c";

		mostrarPergunta(pergunta6);
		verificarResposta(pergunta6);

		Pergunta pergunta7 = new Pergunta();
		pergunta7.frase = "............. P E R G U N T A  07 .............\n\nQuantas vezes o Brasil foi campeão da Copa do Mundo ?\n";
		pergunta7.alternativaA = "a) 4";
		pergunta7.alternativaB = "b) 6";
		pergunta7.alternativaC = "c) 3";
		pergunta7.alternativaD = "d) 5";
		pergunta7.respostaCorreta = "d";

		mostrarPergunta(pergunta7);
		verificarResposta(pergunta7);

		Pergunta pergunta8 = new Pergunta();
		pergunta8.frase = "............. P E R G U N T A  08 .............\n Qual é a metade da metade de 400 ?\n";
		pergunta8.alternativaA = "a) 250";
		pergunta8.alternativaB = "b) 100";
		pergunta8.alternativaC = "c) 300";
		pergunta8.alternativaD = "d) 200 ";
		pergunta8.respostaCorreta = "b";

		mostrarPergunta(pergunta8);
		verificarResposta(pergunta8);

		Pergunta pergunta9 = new Pergunta();
		pergunta9.frase = "............. P E R G U N T A  09 .............\n A Linceça do Windons é ? \n ";
		pergunta9.alternativaA = "a) Precisa só pagar 50 % do sitema operacional ";
		pergunta9.alternativaB = "b) Paga ";
		pergunta9.alternativaC = "c) Gratuita";
		pergunta9.alternativaD = "d) Alguns pontos gratis ";
		pergunta9.respostaCorreta = "b";

		mostrarPergunta(pergunta9);
		verificarResposta(pergunta9);

		Pergunta pergunta10 = new Pergunta();
		pergunta10.frase = "............. P E R G U N T A  10 .............\n Quantas vidas tem um gato ? \n";
		pergunta10.alternativaA = "a) 4 ";
		pergunta10.alternativaB = "b) 9 ";
		pergunta10.alternativaC = "c) 7 ";
		pergunta10.alternativaD = "d) 1 ";
		pergunta10.respostaCorreta = "d";

		mostrarPergunta(pergunta10);
		verificarResposta(pergunta10);
		sc.close();

	}
}
