package tp01p04;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		Productoria cProd=new Productoria();
		Sumatoria cSum=new Sumatoria();
		Scanner valorSuma = new Scanner(System.in);
		Scanner valorProd = new Scanner(System.in);
		System.out.println("ingrese valor para sumatoria");
		int vs= valorSuma.nextInt();
		System.out.println("ingrese valor para productoria");
		int vp= valorProd.nextInt();
		cProd.calcularProductoria(vp);
		cSum.calcularSumatoria(vs);

	}

}
