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
public class Ex7 {
    
    public void BOMPRATO() {
         Scanner teclado = new Scanner(System.in);
         
         float peso, preco, kg;
         
         kg = 14;
         
         System.out.println("Qual o peso do prato? ");
         peso = teclado.nextFloat();
         
         preco = peso*kg;
         
         System.out.println("O preço final será: " + preco);
    }
}
