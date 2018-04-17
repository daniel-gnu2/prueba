package tp01p03;

import java.util.Scanner;

public class CantidadPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosPrimos np = new NumerosPrimos();
		Scanner inicio = new Scanner(System.in);
		Scanner fin = new Scanner(System.in);

		System.out.println("ingrese inicio de rango. ");
		int a = inicio.nextInt();
		System.out.println("ingrese final de rango. ");
		int b = fin.nextInt();
		System.out.println(np.listarPrimos(a, b));
	}

}
