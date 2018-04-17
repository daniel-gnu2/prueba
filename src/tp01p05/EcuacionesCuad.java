package tp01p05;
import java.util.Scanner;
public class EcuacionesCuad {
	
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Ingresa coeficiente cuadratico");
	      int a= sc.nextInt();
	      System.out.println("Ingresa coeficiente lineal");
	      int b= sc.nextInt();
	      System.out.println("Ingresa constante");
	      int c= sc.nextInt();
	      double det=Math.pow(b,2)-4*a*c;
	      if(det>0){
	         
	          double x1=(-b+Math.sqrt(det))/(2*a);
	          double x2=(-b-Math.sqrt(det))/(2*a);
	          System.out.println("X1 = "+x1+" X2 = "+x2);
	        
	      }else{
	      System.out.println("El coeficiente cuadratico debe ser diferente de 0");
	      }      
	      }

}
