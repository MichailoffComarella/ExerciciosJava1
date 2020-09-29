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
public class Ex12 {
    
    public void fabrica() {
        
        Scanner teclado = new Scanner(System.in);
        
        int dias, meses, anos;
        
        System.out.println("Insira o número de dias sem acidentes: ");
        dias = teclado.nextInt();
        
        meses = dias/30;
        dias = dias%30;
        
        anos = meses/12;
        meses = meses%12;
        
        System.out.println("Serão: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        
    }
}
