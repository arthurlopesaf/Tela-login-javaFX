package com.example.telalogin;

public class Cliente {

    private String nome;
    private String endereco;
    private String email;
    private String observacao;
    private String telefone;

    public Cliente(String nome, String endereco, String email, String observacao, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.observacao = observacao;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getObservacao() {
        return observacao;
    }

    public String getTelefone() {

        return telefone;
    }
}
