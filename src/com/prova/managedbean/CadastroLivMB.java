package com.prova.managedbean;

import java.util.List;

import com.prova.bean.Livro;

public class CadastroLivMB {
	private Livro liv;
	private List<Livro> livros;
	
	public CadastroLivMB(){
		
	}
	
	public List<Livro> getLivroLista() {
        return livros;
    }
	
	public void setLivroLista(List<Livro> livros) {
	        this.livros = livros;
	}
	
	public String home(){
		return "index";
	}
	
	public String cadastroLivro(){
		return "cadastro";
	}
	
	public String salvarLivro() {
        livros.add(liv);
        liv = new Livro();
        return "cadastro";
    }
    
    public String pesquisarLivro() {
		livros = liv.getListLivro(liv);
		return "index";
	}

}
