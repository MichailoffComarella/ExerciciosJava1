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
public class Ex1 {

        public void notas() {
        
            int n1, n2;
            float res;
            Scanner teclado = new Scanner(System.in);

            System.out.println("Insira a nota 1: ");
            n1 = teclado.nextInt();
            System.out.println("Insira a nota 2: ");
            n2 = teclado.nextInt();


            res = (n1+n2)/2;
            System.out.println("Resposta: " + res);
            System.out.println("");
        }
}
