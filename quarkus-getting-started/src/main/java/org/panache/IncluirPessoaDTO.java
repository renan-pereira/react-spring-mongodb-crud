package org.panache;

import org.panache.Pessoa.Tipo;

public class IncluirPessoaDTO {

    private int id;

    private String nome;

    private Tipo tipo;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
