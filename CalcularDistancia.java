package Practica2;

import java.util.Scanner; 

public class CalcularDistancia {

	public static double calcularDistancia(double x1, double x2, double y1, double y2) { 
			  return 0.0; 
			 } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, x2, y1, y2, i1, i2;  
		  Scanner sc = new Scanner(System.in); 
		   
		  System.out.println("Lado a1 (x): "); 
		  x1 = sc.nextDouble(); 
		  System.out.println("Lado a2 (y): "); 
		  x2 = sc.nextDouble(); 
		  System.out.println("Lado b1 (x): "); 
		  y1 = sc.nextDouble(); 
		  System.out.println("Lado b2 (y): "); 
		  y2 = sc.nextDouble(); 
		  System.out.println("Lado c1 (x): "); 
		  i1 = sc.nextDouble(); 
		  System.out.println("Lado c2 (x): "); 
		  i2 = sc.nextDouble(); 
		   
		  	double AB = calcularDistancia(x1, x2, y1, y2);
	        double BC = calcularDistancia(y1, y2, i1, i2);
	        double CA = calcularDistancia(i1, i2, x1, x2);

	        System.out.printf("Distancia AB: %.2f\n", AB);
	        System.out.printf("Distancia BC: %.2f\n", BC);
	        System.out.printf("Distancia CA: %.2f\n", CA);
		   
		  Math.sqrt ( 
		    Math.pow(x2-x1,2) 
		    +  Math.pow(y2-y1,2) 
		    );
		  
		  if (AB == BC && BC == CA) {
	            System.out.println("Equilatero");
	             } 
		  
		  else if (AB == BC || AB == CA || BC == CA) {
	            System.out.println("Isoceles");  
	        } 
		  
	      else {
	            System.out.println("Escaleno");
	        }
	}

}