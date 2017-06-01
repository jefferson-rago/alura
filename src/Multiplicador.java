
public class Multiplicador implements AcaoAposGeraNota {

	private final double fator;
	
	public Multiplicador(double fator){
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * this.fator);
	}

}
