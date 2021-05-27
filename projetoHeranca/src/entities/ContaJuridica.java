package entities;

public class ContaJuridica extends ContaFisica{
	private double limiteSaque;
	
	public ContaJuridica() {
		
	}

	public ContaJuridica(int numero, String titular, double saldo, double limiteSaque) {
		super(numero, titular, saldo); //Super classe, � super, 
		//pois estes atributos j� est�o acontecendo na classe ContaFisica
		
		
		this.limiteSaque = limiteSaque;
	}
	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void emprestimo(double valor) {
		if(valor<=limiteSaque) {
			deposito(valor);
		}
	}

}
