/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unican_oop;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 *
 * @author lagra
 */
public class Grua {
    // atributos
    private double b;
    private double l1;
    private double l2;
    private double g;
    public double alpha , beta, gamma;
    
    // constructor

    public Grua(double b, double l1, double l2, double g) {
        this.b = b;
        this.l1 = l1;
        this.l2 = l2;
        this.g = g;
    }
    // metodos
    
    public double radio(){
        
         alpha = gamma-beta +180;
         beta = gamma-alpha +180;
         gamma = alpha+beta -180;
        
        return  l1*cos(alpha)+l2*sin(beta);
    }
    public double altura(){
        return l1*sin(alpha)-l2*sin(gamma)+b-g;
    }
    
    public static void main(String[] args) {
        Grua gr = new Grua(5,10,9,2);
        System.out.println(gr.altura());
        System.out.println(gr.radio());
        
    }
    
    
}
