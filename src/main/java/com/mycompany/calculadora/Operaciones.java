/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;


//import javax.swing.JOptionPane; 
public class Operaciones {
    //Atributos
    
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
  
    //metodo de suma
    
    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;        
    }
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;       
    }
    public void multiplicar(int numero1,int numero2){
        multiplicacion=numero1*numero2;      
    }
    public void dividir(int numero1,int numero2){
        division=numero1/numero2;        
    }
    public void mostrarResultados(){
        System.out.println("La suma es : "+suma );
        System.out.println("La resta es : "+resta);
        System.out.println("La multilicaión es : "+multiplicacion);
        System.out.println("La división es  : "+division);
    }
}
