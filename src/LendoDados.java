import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		// A linha abaixo cria uma variavel (espa�o na RAM) que guarda texto
		String nome;
		System.out.println("Por favor, digite o seu nome: ");
		// A linha abaixo cria um Scanner, que � quem permite ler dados do teclado
		Scanner leitor = new Scanner (System.in);
		// A linha abaixo le um texto fornecido pelo us�ario e guarda na variavel nome
		nome = leitor.next();
		// A linha abaixo exibe  uma mensagem com o conte�do da variavel nome
		System.out.println("Boa noite para voc�, " + nome);
		// como abrimos um recurso externo (a leitura de dados pelo teclado) precisamos fechar para evitar erros em outros sistemas 
		leitor.close();
	}

}
