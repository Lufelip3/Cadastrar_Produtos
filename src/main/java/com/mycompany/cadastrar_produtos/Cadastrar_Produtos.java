/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadastrar_produtos;

/**
 *
 * @author luis.fmleite
 */
// Declaração da classe pública Cadastrar_Produtos, que representa um modelo de dados para um produto
public class Cadastrar_Produtos {
// Atributos privados da classe, seguindo o princípio de encapsulamento

    private String nome;         // Nome do produto
    private String descrição;    // Descrição do produto
    private int quantidade;      // Quantidade disponível
    private double preco;        // Preço unitário

    // Construtor público que inicializa os atributos com os valores recebidos
    public Cadastrar_Produtos(String nome, String descrição, double preco, int quantidade) {
        this.nome = nome;
        this.descrição = descrição;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descrição
     */
    public String getDescrição() {
        return descrição;
    }

    /**
     * @param descrição the descrição to set
     */
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
