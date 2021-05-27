package entities;

public class Empregado {
	private String nome;
	private int horas;
	private double valorPorHora;
	
	public Empregado(){
		
	}
	
	public Empregado(String nome, int horas, double valorPorHora){
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setHoras(int horas) {
			this.horas = horas;
		}
		
		public int getHoras() {
			return horas;
		}
		
		public void setValorPorHora(double valorPorHora) {
			this.valorPorHora = valorPorHora;
		}
		
		public double getValorPorHora() {
			return valorPorHora;
		}
		
		
		public double pagamento() {
			return horas*valorPorHora;
			
		}
}
	