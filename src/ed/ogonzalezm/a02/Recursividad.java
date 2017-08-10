/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a02;

/**
 *
 * @author HONORIO ZAIBACK
 */
public class Recursividad {
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    
    
    public static int sumaVector(int v[], int n ){
        if (n==0){
            return v[n];
        }else{
            System.out.println("Posicion " +n);
            return sumaVector( v ,n=n-1) + v[n];
        }
    }
    
    public static int multVector(int v[], int n ){
        if (n==0){
            return v[n];
        }else{
            System.out.println("Posicion " +n);
            return sumaVector( v ,n=n-1) * v[n];
        }
    }
}
