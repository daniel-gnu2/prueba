package tp01p03;

public class NumerosPrimos {
	int contadorp = 0;

	public int listarPrimos(int inicio, int fin) {

		for (int i = inicio; i <= fin; i++) {
			if (esPrimo(i)==true){
				contadorp=contadorp+1;
			}

		}
		return contadorp;

	}

	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
}