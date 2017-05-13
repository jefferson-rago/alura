
public interface Resposta {
	void responde(Requisicao req, Conta conta);
	void setProximo(Resposta resposta);
}
