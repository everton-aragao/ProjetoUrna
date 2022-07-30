
package com.mycompany.urna3;

import java.util.Scanner;

public class Urna3 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("== Urna Eletronica ==");
       System.out.println(" ");
       System.out.println("Selecione candidato");
       System.out.println("      ");
       System.out.println("----13 Lula---");
       System.out.println("----12 Ciro---");
       System.out.println("----22 bolsonaro---");
       System.out.println("Digite 0 para nulo");
          
        
       int voto = sc.nextInt();
       int votoLula =0;
       int votoCiro =0;
       int votoBolsonaro = 0;
       int votoNulo =0;
       int votoTotal =0;
       int senha = 123;
       
       while (voto >=0){
           if  (voto == 13){
               System.out.println("Voto no Lula confirmado \n");
               
               votoLula ++; votoTotal++ ;
           }else if (voto == 12){ votoCiro ++; votoTotal++ ;
                System.out.println("Voto confirmado no Ciro \n");
                
           }else if (voto == 22){ votoBolsonaro ++; votoTotal++ ;
                System.out.println("Voto confirmado no bolsonaro \n");
                
           }else if (voto == 0){ votoNulo ++; votoTotal++ ;
                   System.out.println("Você anulou seu voto");
                   
           }else  { System.out.println(" CANDIDATO INEXISTENTE!\n ");
           
           } System.out.println("Vote novamente! \n \nOu digite (-1)para encerrar!");
           voto =sc.nextInt();
           } 
       
       
       
       
       
       
           
                   
          System.out.println("Votação encerrada.");
          System.out.println("  ");
          System.out.println("___ RESULTADO___");
          System.out.println("Ciro = "+ votoCiro);
          System.out.println("Lula = "+ votoLula);
          System.out.println("Bolsonaroro = "+ votoBolsonaro);
          System.out.println("Nulo = "+ votoNulo);
          System.out.println("  ");
          System.out.println(" TOTAL = "+ votoTotal );
           
         
          
            
    
       sc.close();
    }
}
