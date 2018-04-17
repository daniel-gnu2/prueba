package tp01p01;

public class Tp01p01 {

	public static void main(String[] args) {
		
		Punto p01=new Punto();
		p01.mostrarImpares();

	}

	}
class Punto {

	public void mostrarImpares() {
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

	}

}
