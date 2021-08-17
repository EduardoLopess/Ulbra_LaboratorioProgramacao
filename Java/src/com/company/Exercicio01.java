package com.company;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double preco, porcentagem, desconto, precoDesconto;

        System.out.println("Digite o valor do Produto R$:");
        preco = tc.nextDouble();
        System.out.println("Porcentagem do desconto:");
        porcentagem = tc.nextDouble();
        desconto = preco*porcentagem/100;
        precoDesconto = preco-desconto;

        System.out.println("Valor do Produto R$:"+preco);
        System.out.println("Valor do Desconto:"+desconto);
        System.out.println("Valor do Produto com desconto R$:"+precoDesconto);
    }
}
