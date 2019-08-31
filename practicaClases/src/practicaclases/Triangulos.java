package practicaclases;

public class Triangulos extends Figuras{
	private String tipo;
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	@Override
	public double calcularArea()
	{
		return getArea()*3;
	}
	
	public double calcularPerimetro()
	{
		return getPerimetro();
	}
}
