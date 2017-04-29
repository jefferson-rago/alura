
public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if(orcamento.getValor() < 1000){
			return orcamento.getValor() * 0.5;
		}else if(orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000){
			return orcamento.getValor() * 0.7;
		}else{
			return (orcamento.getValor() * 0.8) + 30;
		}
	}
	
	public static void main(String[] args) {
		Orcamento oc = new Orcamento(1500.0);
		Imposto iccc = new ICCC();
		
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		c.realizaCalculo(oc, iccc);
	}
}
