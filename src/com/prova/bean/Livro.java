package com.prova.bean;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private String titulo;
	private String autor;
	private String assunto;
	private String tipoPublicacao;
	
	private List<Livro> listaLivros = new ArrayList<Livro>();
	
	public Livro(){
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTipoPublicacao() {
		return tipoPublicacao;
	}

	public void setTipoPublicacao(String tipoPublicacao) {
		this.tipoPublicacao = tipoPublicacao;
	}
	
	public List<Livro> getListLivro(Livro livro) {
		return listaLivros;
	}
	
	public List<Livro> getListLivro(){
		return listaLivros;
	}

	public String toString() {
        return this.titulo;
    }

}
