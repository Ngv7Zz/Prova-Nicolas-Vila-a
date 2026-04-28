/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provajava;

import java.util.Scanner;

public class ProvaJava {
          
      public static void main(String[] args) {
          
          int[][] sala = new int[6][8];
          
          Scanner sc = new Scanner(System.in);
          System.out.println("1) Reservar assento");
          System.out.println("2) Cancelar reserva");
          System.out.println("3) Exibir mapa da sala");
          System.out.println("4) Exibir quantidade de assentos livres e ocupados");
          System.out.println("5) Encerrar");
          System.out.println("Escolha a sua opcao: ");
          
          int opcao = 0;
          
          opcao= sc.nextInt();
                  
          if(opcao==1){
              System.out.println("Digite o numro da fileira de 1 a 6: ");
              int fileira = sc.nextInt() - 1;
              System.out.println("digite o assento de 1 a 8: ");
              int assento = sc.nextInt() -1;
              
              if (sala [fileira][assento] == 0){
                sala[fileira][assento] = 1; 
                System.out.println("Seu assebto foi reservado");
                }else{
                  System.out.println("assento ja utilizado");}
              } else if(opcao==2){
                  System.out.println("Digite o numero da fileira pra cancelar de 1 a 6");
                   int fileira = sc.nextInt() - 1;
                 System.out.println("Digite o numero do assento pra cancelar de 1 a 8");
                   int assento = sc.nextInt() - 1;
                   if(sala [fileira][assento] == 1){
                       sala[fileira][assento] = 0;
                       System.out.println("Reserva cancelada");
                   }else{
                       System.out.println("Assento disponivel");
                   }        
                   }
           else if (opcao == 3){
              for (int i = 0; i < 6; i++) {
                    System.out.println("Fileira " + (i + 1) + ": ");
                    
                    for (int j = 0; j < 8; j++) {
                        System.out.println(sala[i][j] + " "); 
                    }
                        }  
                        }else if(opcao == 5){
                            System.out.println("Encerrado");
                        }

               }
           }
      

    
    

