package com.infnet.dddearquiteturaescalaveltp3.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Item {
    private String id;
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Item(){

    }

    public Item(String id, String nome, String descricao, double precoUnitario, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return precoUnitario * quantidade;
    }
}
