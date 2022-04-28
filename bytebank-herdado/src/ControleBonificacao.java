
public class ControleBonificacao {

	private double soma;
	
	public void registra(Gerente g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;
		}
	
	public void registra(Supervisor s) {
		double boni = s.getBonificacao();
		this.soma = this.soma + boni;
		}
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		}
	
	public double getSoma() {
		return soma;
	}
}