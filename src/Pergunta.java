
public class Pergunta {

 // data class: uma classe que serve para armezenar dados
 // definir os atributos 
	
	private int numero;
	private String questao;
	private String tema;
	
 // criar 2 construtores
	public Pergunta () {
		//construtor padrão ou default
	
	}
	
	public Pergunta (int number, String question, String theme) {
		numero = number;
		questao = question;
		tema = theme;
		
		
	}
	
	public int getNumero() {
		return getNumero();
		
	}
	
	public void setNumero(int num) {
		numero = num;
	}
	
}

