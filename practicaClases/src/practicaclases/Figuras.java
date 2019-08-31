package practicaclases;

public abstract class Figuras implements IFiguras, IFiguras2{
	private double base;
	private double altura;
	private String color;
	private double area;
	private double perimetro;
		
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	Figuras(int b, int a)
	{
		base=b;
		altura=a;
	}
	
	Figuras()
	{
		
	}
	
	Figuras(int b)
	{
		base=b;
	}
	
	Figuras(int a, int b, String color)
	{
		altura=a;
		base=b;
		this.color=color;
	}
	
	public void setAltura(int _altura)
	{
		altura = _altura;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public void setBase(int base)
	{
		this.base=base;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setPerimetro(double perimetro)
	{
		this.perimetro=perimetro;
	}
	
	public double getPerimetro()
	{
		return perimetro;
	}
	
	public double calcularArea()
	{
		return area=area*2;
	}
}
