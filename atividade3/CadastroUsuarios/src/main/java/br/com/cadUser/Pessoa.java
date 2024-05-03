package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Pessoa {
    private String nome;
    private List<String> nomesArmazenados;
    
    @PostConstruct
    public void init() {
        nomesArmazenados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<String> getNomesArmazenados() {
        return nomesArmazenados;
    }

    public void salvar() {
    	nomesArmazenados.add(nome);
    	 System.out.println("Nomes armazenados:");
    	    for (String nome : nomesArmazenados) {
    	        System.out.println(nome);
    }
    	    
  }
}
