package practicaclases;

public class AppFiguras {

	public static void main(String[] args) {
		Figuras figura1;
		figura1 = new Triangulos();
		
		Figuras figura2 = new Circulos();

		Figuras figura3;
		figura3 = new Cuadrados();
		
		figura2.setAltura(20);
		figura2.setColor("Red");
		figura3.setBase(30);
		figura3.setAltura(30);
		figura3.setColor("Verde");
		
		
		Triangulos triangulo1 = new Triangulos();
		triangulo1.setBase(40);
		triangulo1.setAltura(40);
		triangulo1.setColor("Rosa Mexicano");
		triangulo1.setTipo("Equilatero");
		Figuras triangulo2 = new Triangulos();
		
		
		System.out.println("Valores de figura1");
		System.out.println(figura1.getBase());
		System.out.println(figura1.getAltura());
		System.out.println(figura1.getColor());
		System.out.println("Valores de figura2");
		System.out.println(figura2.getBase());
		System.out.println(figura2.getAltura());
		System.out.println(figura2.getColor());
		System.out.println("Valores de figura3");
		System.out.println(figura3.getAltura());
		System.out.println(figura3.getBase());
		System.out.println(figura3.getColor());
		System.out.println("Valores de Triangulo1");
		System.out.println(triangulo1.getAltura());
		System.out.println(triangulo1.getBase());
		System.out.println(triangulo1.getColor());
		System.out.println(triangulo1.getTipo());
		
	}

}
