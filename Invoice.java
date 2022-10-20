

public class Invoice {
	private int numeroItem;
	private String descricaoItem;
	private int quantidade;
	private double preco;
	
	
	
	public Invoice(int numeroItem, String descricaoItem, int quantidade, double preco) {
		setNumeroItem(numeroItem);
		this.descricaoItem = descricaoItem;
		setQuantidade(quantidade);
		setPreco(preco);
	}
	
	public double getInvoiceAmount() {
		return preco*quantidade;
	}
	
	public int getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade >= 0 ? quantidade : 0;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco >= 0 ? preco : 0;
	}
	
	
}
