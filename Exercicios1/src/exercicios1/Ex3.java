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
public class Ex3 {
    
    public void calcular() {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, soma, sub, mult;
        double div;
        
        System.out.println("Insira o 1º número: ");
        num1 = teclado.nextInt();
        System.out.println("Insira o 2º número: ");
        num2 = teclado.nextInt();
        
        System.out.println("");
        System.out.println("Soma: ");
        soma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
        
        System.out.println("");
        System.out.println("Subtração: ");
        sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sub);
        
        System.out.println("");
        System.out.println("Multiplicação: ");
        mult = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mult);
        
        System.out.println("");
        System.out.println("Divisão: ");
        div = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
}
