
public class TesteDeImpostoMuitoAlto {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(new ImpostoMuitoAlto());
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
	}
	

}
