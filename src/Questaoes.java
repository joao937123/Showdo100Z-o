
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

		public static void verificarResposta(Pergunta perg) {

			String respostaEscolhida = sc.nextLine();

			if (respostaEscolhida.equals(perg.respostaCorreta)) {
				
				System.out.println("Parabéns, você acertou :)\n");
			} else {
				System.out.println("\n		Y O U   L O S E R\n");
				Menu.mostrarMenu();
			
			}

		}

		public static void iniciar() {

			double premio = new Random().nextDouble(0.5, 3);
			
			Pergunta pergunta1 = new Pergunta();
			pergunta1.frase = "............. P E R G U N T A  01 .............\n\nQual foi o país que inventou o chuveiro elétrico ?\n";
			pergunta1.alternativaA = "a) França";
			pergunta1.alternativaB = "b) Inglaterra";
			pergunta1.alternativaC = "c) Brasil";
			pergunta1.alternativaD = "d) Austrália";
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
			pergunta2.frase = "............. P E R G U N T A  02 .............\n\nQuem é o rei do Pop ?\n";
			pergunta2.alternativaA = "a) Elvis Presley ";
			pergunta2.alternativaB = "b) Bruno Mars";
			pergunta2.alternativaC = "c) Manoel Gomes";
			pergunta2.alternativaD = "d) Micheal Jackson";
			pergunta2.respostaCorreta = "d";

			mostrarPergunta(pergunta2);
			verificarResposta(pergunta2);

			Pergunta pergunta3 = new Pergunta();
			pergunta3.frase = "............. P E R G U N T A  03 .............\n\nQuantos ossos tem um corpo humano ?\n";
			pergunta3.alternativaA = "a) 209";
			pergunta3.alternativaB = "b) 203";
			pergunta3.alternativaC = "c) 201";
			pergunta3.alternativaD = "d) 206";
			pergunta3.respostaCorreta = "d";

			mostrarPergunta(pergunta3);
			verificarResposta(pergunta3);

			Pergunta pergunta4 = new Pergunta();
			pergunta4.frase = "............. P E R G U N T A  04 .............\n\nQual é a sigla do HD ?\n";
			pergunta4.alternativaA = "a) Hard Definition";
			pergunta4.alternativaB = "b) Hardcore";
			pergunta4.alternativaC = "c) Hard Disk";
			pergunta4.alternativaD = "d) Hight Disk";
			pergunta4.respostaCorreta = "c";

			mostrarPergunta(pergunta4);
			verificarResposta(pergunta4);

			Pergunta pergunta5 = new Pergunta();
			pergunta5.frase = "............. P E R G U N T A  05 .............\n\nComplete a música \nOs seus problemas você deve esquecer...\n";
			pergunta5.alternativaA = "a) Hakuna matata! Sim, vai entender!";
			pergunta5.alternativaB = "b) Isso é viver, é aprender!";
			pergunta5.alternativaC = "c) Hakuna matata";
			pergunta5.alternativaD = "d) Essas duas palavras resolvem todos os seus problemas!";
			pergunta5.respostaCorreta = "b";

			mostrarPergunta(pergunta5);
			verificarResposta(pergunta5);

			Pergunta pergunta6 = new Pergunta();
			pergunta6.frase = "............. P E R G U N T A  06 .............\n\nQuais são os nomes dos cinco oceanos ?\n";
			pergunta6.alternativaA = "a) Atlântica, Índico, agressivo e Glacial Antártico";
			pergunta6.alternativaB = "b) Atlântico, Índicio, Pacífico, Glacial Ártico e Guaraná Antarctica ";
			pergunta6.alternativaC = "c) Atlântico, Índico, Pacífico, Glacial Ártico e Glacial Antártico";
			pergunta6.alternativaD = "d) Atlântico, Índico, Pacífico, Gladiadores Ártico e Gladiadores Antártico";
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
			pergunta8.frase = "............. P E R G U N T A  08 .............\n\nQual é o maior animal vivo do planeta Terra ?\n";
			pergunta8.alternativaA = "a) Elefante";
			pergunta8.alternativaB = "b) Baleia azul";
			pergunta8.alternativaC = "c) Tubarão";
			pergunta8.alternativaD = "d) Rinoceronte";
			pergunta8.respostaCorreta = "b";

			mostrarPergunta(pergunta8);
			verificarResposta(pergunta8);

			Pergunta pergunta9 = new Pergunta();
			pergunta9.frase = "............. P E R G U N T A  09 .............\n\nQuantos anos há em dois séculos e meio ?\n";
			pergunta9.alternativaA = "a) 25 anos";
			pergunta9.alternativaB = "b) 250 anos";
			pergunta9.alternativaC = "c) 2500 anos";
			pergunta9.alternativaD = "d) 25000 anos";
			pergunta9.respostaCorreta = "b";

			mostrarPergunta(pergunta9);
			verificarResposta(pergunta9);

			Pergunta pergunta10 = new Pergunta();
			pergunta10.frase = "............. P E R G U N T A  10 .............\n\nA laranja é uma cor ou fruta ?\n";
			pergunta10.alternativaA = "a) É um Suco";
			pergunta10.alternativaB = "b) É uma Fruta";
			pergunta10.alternativaC = "c) É uma Cor";
			pergunta10.alternativaD = "d) É uma fruta e cor";
			pergunta10.respostaCorreta = "d";

			mostrarPergunta(pergunta10);
			verificarResposta(pergunta10);
			sc.close();

		}
	}

	