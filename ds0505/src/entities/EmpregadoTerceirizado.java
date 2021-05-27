package entities;

public class EmpregadoTerceirizado extends Empregado{
	
	private double valorAdicional;
	
	public EmpregadoTerceirizado() {
		
	}
	
	public EmpregadoTerceirizado(String nome, int horas, double valorPorHora, double valorAdicional) {
		super(nome,horas,valorPorHora);
		this.valorAdicional = valorAdicional;	
	}
	
	public void setvalorAdicional(double valorAdicional) {
		this.valorAdicional= valorAdicional;
	}
	
	public double getvalorAdicional() {
		return valorAdicional;
	}
	
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
	
}
