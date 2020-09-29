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
public class Ex9 {
    
    public void mediaPonderada() {
        Scanner teclado = new Scanner(System.in);
        
        float nota1, nota2, nota3, media;
        int p1 = 1;
        int p2 = 2;
        int p3 = 3;
        int peso = p1 + p2 + p3;
        
        System.out.println("Digite sua 1ª nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.println("Digite sua 2ª nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.println("Digite sua 3ª nota: ");
        nota3 = teclado.nextFloat();
        
        media = (((nota1 * p1) + (nota2 * p2) + (nota3 * p3))/peso);
        
        System.out.println("Média ponderada: " + media);
    }
}
