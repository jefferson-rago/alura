
public class TesteDeDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aprova();
		
		System.out.println(reforma.getValor());
		
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
	}
}
