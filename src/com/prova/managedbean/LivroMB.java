package com.prova.managedbean;

import java.util.List;
import com.prova.bean.Livro;

public class LivroMB {
	private Livro liv;
	private List<Livro> livros;
	
	/** Creates a new instance of ProdutoMB */
    public LivroMB() {
    }

	public Livro getLivr() {
		return liv;
	}
	
	public void setLivr(Livro l) {
		this.liv = l;
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

}
