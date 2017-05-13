
public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
	}

	abstract double calcula(Orcamento orcamento);

	protected double calculaDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		} else
			return outroImposto.calcula(orcamento);
	}
}
