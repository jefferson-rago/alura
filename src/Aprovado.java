
public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicaco = false;

	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicaco){
			orcamento.valor -= orcamento.getValor() * 0.5;
		}else{
			throw new RuntimeException("Desconto já aplicado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Oçamento aprovados não podem ser reprovados!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
