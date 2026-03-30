package projeto;

public class Produto {

	String nome;
	int duracao;
	String streaming;
	
	
	
	
	void exibirProduto() {
	System.out.println("Filme: " + this.nome);
	System.out.println("Duração: " + this.duracao);
	System.out.println("Onde assistir: " + this.streaming);

	}
}