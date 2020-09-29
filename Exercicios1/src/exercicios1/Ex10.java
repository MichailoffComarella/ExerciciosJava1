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
public class Ex10 {
    
    public void camisetas() {
        
        Scanner teclado = new Scanner(System.in);
        
        int camP = 8;
        int camM = 10;
        int camG = 15;
        
        int quantP, quantM, quantG, valor;
        
        System.out.println("Insira a quantidade de camisetas Pequenas: ");
        quantP = teclado.nextInt();
        
        System.out.println("Insira a quantidade de camisetas Médias: ");
        quantM = teclado.nextInt();

        System.out.println("Insira a quantidade de camisetas Grandes: ");
        quantG = teclado.nextInt();
        
        valor = ((quantP * camP) + (quantM * camM) + (quantG * camG));
        
        System.out.println("O valor arrecadado será: " + valor);
    }
}
