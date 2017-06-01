import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String observacao;
	private Calendar data;
	
	private List<AcaoAposGeraNota> todasAcoesASeremExecutadas;
	
	public NotaFiscalBuilder(){
		todasAcoesASeremExecutadas = new ArrayList<AcaoAposGeraNota>();
	}
	
	public void adicionaAcao(AcaoAposGeraNota acaoAposGeraNota){
		todasAcoesASeremExecutadas.add(acaoAposGeraNota);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item){
		todosItens.add(item);
		valorBruto += item.getValor();
		imposto += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservavao(String observacao){
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar novaData){
		 data = novaData;
		return this;
	}
	
	public NotaFiscal constroi(){
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, imposto, todosItens, observacao);
		
		for (AcaoAposGeraNota acaoAposGeraNota : todasAcoesASeremExecutadas) {
			acaoAposGeraNota.executa(notaFiscal);
		}
		
		return notaFiscal;
	}
	
}
