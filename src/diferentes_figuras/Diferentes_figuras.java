/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diferentes_figuras;

import clases.Cuadradro;
import clases.CalculadorArea;
import clases.Circulo;
import clases.Rectangulo;

/**
 *
 * @author ESTUDIANTE
 */
public class Diferentes_figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadorArea calA = new CalculadorArea();
       Cuadradro cua = new Cuadradro(3.15);
       Rectangulo rec = new Rectangulo(7.85, 10.85);
       Circulo circulo = new Circulo (7.98);
       
       System.out.println("Calculo de figura: " + calA.calculadorArea(cua));
       System.out.println("Calculo de figura: " + calA.calculadorArea(rec));
       System.out.println("Calculo de figura: " + calA.calculadorArea(circulo));
    }
    
}
