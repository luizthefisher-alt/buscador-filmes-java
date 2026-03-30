package projeto;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	ArrayList<Produto> lista = new ArrayList<>();

	Produto filme = new Produto();
	Produto filme2 = new Produto();
	Produto filme3 = new Produto();
	Produto filme4 = new Produto();
	Produto filme5 = new Produto();
	Produto filme6 = new Produto();
	Produto filme7 = new Produto();
	
	filme.nome = "Os vingadores";
	filme.duracao = 120;
	filme.streaming = "Disney plus";
	
	filme2.nome = "Batman begins";	
	filme2.duracao = 130;
	filme2.streaming = "HBO max";
	
	filme3.nome = "Interestelar";
	filme3.duracao = 150;
	filme3.streaming = "HBO max";
	
	filme4.nome = "Lalaland";
	filme4.duracao = 120;
	filme4.streaming = "Prime video";
	
	filme5.nome = "Liga da Justiça";
	filme5.duracao = 100;
	filme5.streaming = "Netflix";
	
	filme6.nome = "Zootopia";
	filme6.duracao = 120;
	filme6.streaming = "Disney plus";
	
	filme7.nome = "O agente secreto";
	filme7.duracao = 180;
	filme7.streaming = "Netflix";
	
	lista.add(filme);
	lista.add(filme2);
	lista.add(filme3);
	lista.add(filme4);
	lista.add(filme5);
	lista.add(filme6);
	lista.add(filme7);
	
	System.out.println("Digite o nome do filme: ");
	String nome = sc.nextLine().trim().toLowerCase();
	
	System.out.println("==============");
	
	boolean encontrado = false;
	
	for(Produto p : lista) {
        if(p.nome.toLowerCase().contains(nome)) {
            p.exibirProduto();
            encontrado = true;
        }
    }
	
	if(!encontrado) {
        System.out.println("Filme não encontrado");
    }

    sc.close();

              
     }

}
