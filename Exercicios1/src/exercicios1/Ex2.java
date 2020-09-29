/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios1;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Ex2 {
    
    public void funcionario () {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        
        System.out.println("Insira seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Insira sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Insira seu salário: ");
        salario = teclado.nextDouble();
        
        System.out.println("--------------------------------");
        System.out.println("Nome:" + nome);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("Salário: " + salario + " reais.");
        System.out.println("--------------------------------");
    }
}
