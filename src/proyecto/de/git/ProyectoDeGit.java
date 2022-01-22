/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.de.git;

import java.util.Scanner;

/**
 *
 * @author JANUS-H110MCI5
 */
public class ProyectoDeGit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int segundos  =0;
        System.out.println("cuanto segundos deseas");
        segundos=sc.nextInt();
        
        for (int i = 0; i < segundos; i++) {         
            System.out.println(i+1);
            delaySegundo();
        }        
    }
    
    private static void delaySegundo(){
        
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            
        }
    }
    
}
