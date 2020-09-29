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
public class Ex8 {
    
    public void mesDia() {
        Scanner teclado = new Scanner(System.in);
        
        int dia, mes, passou;
        
        System.out.println("Digite o dia: ");
        dia = teclado.nextInt();
        
        System.out.println("Digite o número do mês: ");
        mes = teclado.nextInt();
        
        passou = (30 * mes) - dia;
        
        System.out.println("Já se passaram: " + passou + " dias do início do ano.");
        
    }
}
