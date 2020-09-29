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
public class Ex5 {
    
    public void vendaCarro() {
        Scanner teclado = new Scanner(System.in);
        
        double inicial,percRev, impostos, fim;
        
        System.out.println("Digite o custo de fábrica: ");
        inicial = teclado.nextDouble();
        
        percRev = (inicial * 25)/100;
        
        impostos = (inicial * 45)/100;
        
        fim = inicial + percRev + impostos;
        
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("Preço de Fábrica: " + inicial);
        System.out.println("Porcentagem Revendendor: " + percRev);
        System.out.println("Impostos: " + impostos);
        System.out.println("Preço final: " + fim);
        
        
    }
}
