package projeto;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	ArrayList<Filme> lista = new ArrayList<>();

	Filme filme1 = new Filme("Os vingadores", 120, "Disney plus");
	Filme filme2 = new Filme("Batman begins", 130, "HBO max");
	Filme filme3 = new Filme("Interestelar", 150, "HBO max");
	Filme filme4 = new Filme("Lalaland", 120, "Prime video");
	Filme filme5 = new Filme("Liga da justiça", 100, "Netflix");
	Filme filme6 = new Filme("Zootopia", 120, "Disney plus");
	Filme filme7 = new Filme("O agente secreto", 180, "Netflix");
	
	
	
	lista.add(filme1);
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
	
	for(Filme p : lista) {
        if(p.getNome().toLowerCase().contains(nome)) {
            p.exibirFilme();
            encontrado = true;
        }
    }
	
	if(!encontrado) {
        System.out.println("Nenhum resultado encontrado");
    }

    sc.close();
    

              
     

	}
}

