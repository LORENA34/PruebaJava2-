/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 **Lorena Salinas Rojo
 * @author LAB15
 *Fecha: NOVIEMBRE 6 de 2017
 * Programa: Prueba2Lorena
 * Responsabilidad:Creacion de clases
 * @author LAB15
 */
public class Contraseña  {
  /**
     * @param args the command line arguments
     */
 public static void main(String[] args){
//TODO Auto-generated method stub
         
  Scanner teclado=new Scanner(System.in);       
  
   int contraseña = 0;
   int pass = 0;
   int intentos = 1;
   int maximo = 3;
    
while((contraseña!=1542)&&(intentos<maximo));

{
 System.out.println("introduzca un contraseña"); 
contraseña=teclado.nextInt();

 System.out.println("introduzca un pass");
pass =teclado.nextInt();

if(intentos==3)
{

System.out.println("acceso denegado"); 

intentos=intentos-maximo;

}

System.out.println("contraseña y pass ,correctos");

}
}}