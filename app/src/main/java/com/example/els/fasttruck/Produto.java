package com.example.els.fasttruck;

/**
 * Created by El's on 09/09/2016.
 */
public class Produto {
    private String nome;
    private String descricao;
    /*
    private String imgProd;
    Sugestão de usar imagem atraves da referencia de string.
     */
    private Double preco;


    public Produto(String nome, String descricao, Double preco) {
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public void alterarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }
    public void alterarPreco(double preco){
        this.preco = preco;
    }

}
