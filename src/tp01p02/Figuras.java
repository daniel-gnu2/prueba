package tp01p02;

import java.util.Scanner;

public class Figuras {
	public static void main(String[] args) {
		Scanner altura = new Scanner(System.in);
		Scanner base = new Scanner(System.in);
		Scanner radio = new Scanner(System.in);
		
		Circulo cir = new Circulo();
		Rectangulo rec = new Rectangulo();
		System.out.println("ingrese base y altura");
		int a=altura.nextInt();
		int b=base.nextInt();
		System.out.println("ingrese radio");
		double r=radio.nextDouble();
		System.out.println("area rectangulo : "+rec.area(b, a));
		System.out.println("perimetro rectangulo : "+rec.perimetro(b, a));
		System.out.println("area circulo : "+cir.area(r));
		System.out.println("perimetro circulo : "+cir.perimetro(r));
		

	}
}
