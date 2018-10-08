/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author MORALES
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entradas de las docenas y precio
        Scanner s,d;
        s = new Scanner(System.in);
        d = new Scanner(System.in);
         //variables del monto de la compra,descuento,monto a pagar y el precio
       double montoC, montoD = 0, montP, Precio;
       //almacena docenas a comprar y los obcequios
      int docena,obc = 0;
       System.out.print("ingrese cantidad de docenas del producto ");
       docena = s.nextInt();
       System.out.print("ingrese el precio por docena $");
       Precio = d.nextDouble();
      
      //el monto de la compra
       montoC =docena*Precio;
       //si lleva tres docenas el descuento es de 15% y no hay obsequio
       if (docena == 3)
       {
       montoD = 0.15*montoC;
       
       obc = 0;
       }
       /*si son mas de tres el descuento es de 15% y 
       se le da un producto por cada numero que sobrepase las tres docenas*/
       if (docena > 3)
       {
       montoD = 0.15*montoC;
       
       obc = docena-3;
       }
       //si lleva menos de tres docenas su descuento es del 10% sin obcequio
       if(docena<3 && docena>0)
       {
        montoD = 0.10*montoC;
        obc =0;
       }
       //monto a pagar es monto de la compra menos el descuento
       montP = montoC - montoD;
       
       System.out.println("Monto de a compra: $"+montP);
   System.out.println("Monto de descuento: $" + montoD);
    System.out.println("Obcequios: "+obc);
    }
    
}
