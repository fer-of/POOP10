/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author marif
 */
public class PropagaExcepcion {
    
    public static int miMetodo(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        int c = a/b;
        return c;
        
    }
    public static void main(String[] args){
        try{
            int division = miMetodo(10,0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica arrojada: ");
            e.printStackTrace();
        }
    }
    
}
