package controleestoque;
import java.util.ArrayList;
import java.util.List;

public class salvando {
	String NomeProduto;
	private Float valorproduto;
	private Float estoque;
	private Float resultado;
	
	
	private List<String> resultados = new ArrayList<String>();
	
	public Float getvalorproduto() {
		return valorproduto;
	}
	public void setvalorproduto(Float valorproduto) {
		this.valorproduto = valorproduto;
		
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String NomeProduto) {
		this.NomeProduto = NomeProduto;
	}
	public Float getestoque() {
		return estoque;
	}
	public void setestoque(Float estoque) {
		this.estoque = estoque;
	}
	public Float getResultado() {
		return resultado;
	}
	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}
	public List<String> getResultados() {
		return resultados;
		
	}
	
	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
		
	}
	
	
	public void somar() {
		resultado = valorproduto * estoque;
		resultados.add("\n#Nome do Produto: "+NomeProduto+" \n "+"#Preço: "+valorproduto+" Reais \n "+"#Estoque: "+estoque+" Unidades \n "+"#Valor Total do Estoque R$"+resultado+"\n\n");
		
	}
	
		
}
