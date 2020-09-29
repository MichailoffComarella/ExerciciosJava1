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
public class Ex6 {
    
    public void motorista() {
        Scanner teclado = new Scanner(System.in);
        
        int  X, preco, litros;
        
        System.out.println("Quanto deseja pagar? ");
        X = teclado.nextInt();
        
        System.out.println("Qual o preço da gasolina? ");
        preco = teclado.nextInt();
        
        litros = X/preco;
        
        System.out.println("Será possível colocar: " + litros + " litros no tanque.");
    }
}
