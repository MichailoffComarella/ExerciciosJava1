/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios1;

/**
 *
 * @author Sony
 */
public class Ex4 {
    
    public void trocaVal () {
        int A = 5;
        int B = 10;
        int wait;
        
        System.out.println("------------------------");
        System.out.println("Inicialmente: ");
        System.out.println("Variável A: " + A);
        System.out.println("Variável B: " + B);
        System.out.println("");
        
        wait = A;
        A = B;
        B = wait;
        
        System.out.println("Efetuando troca: ");
        System.out.println("Variável A: " + A);
        System.out.println("Variável B: " + B);
        System.out.println("------------------------");
    }
}
