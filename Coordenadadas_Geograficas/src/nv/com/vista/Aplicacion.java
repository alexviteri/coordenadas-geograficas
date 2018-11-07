/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv.com.vista;

import javax.swing.JOptionPane;
import nv.com.modelo.Punto;

/**
 *
 * @author USER
 */
public class Aplicacion {
    public static void main(String[] args) {
        Punto p1=new Punto(2,3);
        Punto p2=new Punto(5,6);
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Deseas ingresar un punto: \n"
            +"1.- Si \n"
            +"2.- No" ));
            if (op==1) {
                int x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese coordenadas X: "));
                int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese coordenadas Y: "));
             Punto.almacenarpunto(x,y);
             
            }
  //
         
        } while (op!=2);
        Punto.imprimirpuntos();
        }
        /*op=Integer.parseInt(JOptionPane.showInputDialog("deseas ingresar un punto..\n"+
            "\n1.si"+
            "\n1.no"  ));
            if (op==1);
            Punto.almacenarpunto(p1);
        }while(op!=2);
        Punto.imprimirpuntos();
        
        JOptionPane.showMessageDialog(null, p1.toString()+"\n"+
                p2.toString()+"\n"+"la distancia es:"+Punto.calcularDistancias(p1,p2));*/
   }
    

