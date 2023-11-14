package org.iesvdm;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
    }
    public static BigDecimal circulo(BigDecimal radio){
        return BigDecimal.valueOf(Math.PI).multiply(radio.pow(2));
    }
    
    public static BigDecimal pentagono(BigDecimal apotema, BigDecimal lado){
        return ((lado.multiply(BigDecimal.valueOf(5))).multiply(apotema)).divide(BigDecimal.TWO);
    }
}