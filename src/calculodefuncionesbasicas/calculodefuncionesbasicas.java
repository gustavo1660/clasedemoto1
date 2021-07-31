//crear un programa que al recibir como datos dos numeros enteros, calcule la suma, resta, multiplicacion y division de dichos numeros


package calculodefuncionesbasicas;

import java.util.Scanner;


public class calculodefuncionesbasicas {
    
    Scanner lector = new Scanner (System.in);
    
    
   public  calculodefuncionesbasicas() {
       
    float n1, n2, suma, resta, multiplicacion, division;
    
    
    System.out.println("ingrese el primer numero: ");
    n1=lector.nextFloat();
    System.out.println("ingrese el segundo numero: ");
    n2=lector.nextFloat();
    
    suma=n1+n2;
    resta=n1-n2;
    multiplicacion=n1*n2;
    division=n1/n2;
    
    System.out.println("la suma es "+suma);
    System.out.println("la resta es "+resta);
    System.out.println("la multiplicacion es "+multiplicacion);
    System.out.println("la division es "+division);
    
    
}

   
    public static void main(String[] args) {
   
        calculodefuncionesbasicas solucion  = new calculodefuncionesbasicas();
    }
    
}
