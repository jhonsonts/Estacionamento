package jojopose;
import java.util.Scanner;

public class estacionamento_exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner ler = new Scanner(System.in); //  Essse é o Scanner que fara a leitura dos itens no código
				int n1; // nossa variavel do codigo
				System.out.printf("Digite se voce for: Idoso 1, Gestante, 2 e Cadeirante 3!\nCaso nao seja, digite qualquer outro numero: "); //Essa e a interface que aparecera para o usuario, para imputar as informações
				n1 = ler.nextInt(); // Fara a leitura da String
				
				
				if (n1 >= 1 && n1 <= 3) { // Comando de decisao para determinar o valor for verdadeiro
					System.out.print("Voce pode estacionar!"); //Essa e a interface que aparecera para o usuario
				} else { // Comando de decisao caso o valor for falso
					System.out.print("Voce nao pode estacionar!");//Essa e a interface que aparecera para o usuario

				}

			}
		


	}


