import java.util.Arrays;
import java.util.List;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {

		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.paraEmpresa("Caelum").comCnpj("12121212121").comItem(new ItemDaNota("item 1", 200))
				.comItem(new ItemDaNota("item 2", 300)).comItem(new ItemDaNota("item 3", 400)).comObservavao("teste");

		NotaFiscal nf = criador.constroi();
		System.out.println(nf.getValorBruto());
	}
}
