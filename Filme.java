package projeto;

public class Filme {
	
private	String nome;
private	int duracao;
private	String streaming;
	
public Filme(String nome, int duracao, String streaming) {
	this.nome = nome;
	this.duracao = duracao;
	this.streaming = streaming;
}

public String getNome() {
	return nome;
}
public int getDuracao() {
	return duracao;
}
public String getStreaming() {
	return streaming;
}

public	void exibirFilme() {
	System.out.println("-----FILME-----");
	System.out.println("Filme: " + this.nome);
	System.out.println("Duração: " + this.duracao + " minutos");
	System.out.println("Onde assistir: " + this.streaming);
	System.out.println("--------------");
	

	}
}




