import java.util.Calendar;

public class TesteAcoes {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorSMS());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new Multiplicador(5));
		
		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123").comItem(new ItemDaNota("item 1", 300))
				.comObservavao("teste").naData(Calendar.getInstance()).constroi();
	
	System.out.println(nf.getValorBruto());
		
	}
}
