package tp01p04;

public class Productoria {
	public void calcularProductoria(int valor){
		int producto=1;
		for (int i = 1; i <= valor; i++) {
			producto=producto*i;
			
		}
		System.out.println(" la Productoria de "+valor+" es:  "+producto);

	}
	

}
