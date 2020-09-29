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
public class Ex11 {
    
    public void distancia() {
        Scanner teclado = new Scanner(System.in);
        
        int xa, xb, ya, yb;
        double D;
        
        System.out.println("Digite o valor X do ponto A: ");
        xa = teclado.nextInt();
        
        System.out.println("Digite o valor X do ponto B: ");
        xb = teclado.nextInt();
        
        System.out.println("Digite o valor Y do ponto A: ");
        ya = teclado.nextInt();
        
        System.out.println("Digite o valor Y do ponto B: ");
        yb = teclado.nextInt();
        
        D = Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
        
        System.out.println("A distância entre os dois pontos é: " + D);
        
    }
}
