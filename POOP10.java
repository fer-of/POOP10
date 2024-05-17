/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author marif
 */
public class POOP10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int equis = 5/0;
            System.out.println("Equis = " + equis);
        }
        catch (ArithmeticException e){
            System.out.println("Error: division entre cero.");
        }catch (Exception e){
            System.out.println("Error: excepcion  general.");
        }finally{
            System.out.println("El bloque finally siempre se ejecuta.");
        }

    }
        
}

