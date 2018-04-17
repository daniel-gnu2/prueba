package tp01p04;

public class Sumatoria {
	public void calcularSumatoria(int valor){
		int suma=0;
		for(int i=1;i<=valor;i++){
			suma=suma+2*i-1;
		}
		System.out.println(" la sumatoria de "+valor+" es: "+suma);
	}

}
