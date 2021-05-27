package entities;

public class Retangulo {
	//atributos
	public double largura;
	public double altura;
	
	//metodos
		
	public double calcularArea(){
		return(largura*altura);
		
	}
	
	public double calcularPerimetro(){
		return(2*(largura+altura));
		
	}
	
	public double calcularDiagonal() {
		return(Math.sqrt(largura*largura + altura*altura));
	}
}
