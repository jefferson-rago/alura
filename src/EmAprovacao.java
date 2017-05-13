
public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado){
			orcamento.valor -= orcamento.getValor() * 0.5;
		}else{
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento em aprovação não podem ir direto para finalizado!");
	}
}
