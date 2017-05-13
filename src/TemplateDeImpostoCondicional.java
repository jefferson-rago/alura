
public abstract class TemplateDeImpostoCondicional extends Imposto {

	public TemplateDeImpostoCondicional() {
		super();
	}
	
	public TemplateDeImpostoCondicional(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaDoOutroImposto(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
