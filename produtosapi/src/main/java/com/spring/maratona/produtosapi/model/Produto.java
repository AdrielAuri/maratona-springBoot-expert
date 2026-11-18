package com.spring.maratona.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO -> Plain Old Java Object
@Entity
@Table(name = "produto") // serve para saber qual tabela do banco se refere a essa entidade e se o nome da tabela for o mesmo que essa entidade não precisa nomear
public class Produto {

    @Id
    @Column(name = "idProduto") // mapeia determinada coluna do banco para uma entidade e não é obrigatoria caso o nome seja igual.
    private String idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private double precoProduto;

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto='" + idProduto + '\'' +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoProduto=" + precoProduto +
                '}';
    }
}
