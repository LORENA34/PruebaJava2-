/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematicas
/**
 *Lorena Salinas Rojo
 * @author LAB15
 *Fecha: Noviembre 6 de 2017
 * Programa: Prueba2Lorena
 * Responsabilidad:Creacion de clases
*/
public class Pruebajava2 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args)  
 {
   float mes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero"));
   
   //El metodo round es para redondear un decimal
     
 switch(Math.round(mes))//El valor recibe
 {
     case 12:// caso12 mes de diciembre  si el valor es de 12
     JOptionPane.showMessageDialog(null,"Diciembre");
 break;
 
     case 11://caso 11 mes de noviembre sin el valor es 11 
  JOptionPane.showMessageDialog(null,"Noviembre");
 break;
 
 case 10://caso 10 mes de octubre sin el valor es 10 
  JOptionPane.showMessageDialog(null,"Octubre");
 break;
 
 case 9://caso 9 mes de septiembre sin el valor es 9 
  JOptionPane.showMessageDialog(null,"Septiembre");
 break;
 
  case 8://caso 8 mes de agosto sin el valor es 8 
  JOptionPane.showMessageDialog(null,"Agosto");
 break;
 
 case 7://caso 7 mes de julio sin el valor es 7 
  JOptionPane.showMessageDialog(null,"Julio");
 break;
 
 case 6://caso 6 mes de junio el cumple de mi bebe, sin el valor es 6 
  JOptionPane.showMessageDialog(null,"Junio");
 break;
 
  case 5://caso 5 mes de mayo sin el valor es 5 
  JOptionPane.showMessageDialog(null,"Mayo");
 break;
 
  case 4://caso 4 mes de Abril mi cumple sin el valor es 4 
  JOptionPane.showMessageDialog(null,"Abril");
 break;
 
  case 3://caso 3 mes de marzo sin el valor es 3 
  JOptionPane.showMessageDialog(null,"Marzo");
 break;
 
  case 2://caso 2 mes de Febrero sin el valor es 2 
  JOptionPane.showMessageDialog(null,"Febrero");
 break;
 
   case 1://caso 1 mes de enero sin el valor es 1 
  JOptionPane.showMessageDialog(null,"Enero");
 break;
   default:
 JOptionPane.showMessageDialog(null,"Los meses del año");
 }
    

}
 
 
 
 }
