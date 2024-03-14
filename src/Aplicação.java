import java.util.Scanner;

public class Aplicação {

	//Para ser uma classe executável, devemos implementar o metódo main
	
	public static void main(String[] args) {
		
	//Para colher informações do usuário usamos a classe Scanner ( print do python)
		
	    Scanner tec = new Scanner (System.in);
	    
		System.out.println("1. Qual o seu nome?");
		String nome = tec.nextLine(); //nextLine = string
		
		System.out.println("2. Defina classe ou objeto");
		String defClasse = tec.nextLine();
		
		System.out.println("3. Qual a função do construtor?");
		String construtor = tec.nextLine();
		
		System.out.println("4. Qual a sua maior dificuldade até o momento?");
		String dificuldade = tec.nextLine();
	
	 //qual o objetivo do meu programa ? 
	 //imprimir na tela as respotas
	 //armezenar respostas em um arquivo (txt, excel, word,pdf)
	 //guardar as informações em um banco de dados
	 //enviar por email ou mandar para um API

		System.out.println("Seguem as repostas");
		System.out.println(nome + ";" + defClasse + ";" + construtor + ";" + dificuldade);
		
		System.out.printf("%s - %s - %s - %s" , nome , defClasse, construtor, dificuldade);
	}
	
}
