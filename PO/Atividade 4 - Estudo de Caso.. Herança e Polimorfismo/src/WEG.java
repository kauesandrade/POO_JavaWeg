import java.util.ArrayList;

public class WEG {
	private ArrayList<ProdutoWEG> listProdutosDisponiveis = new ArrayList<>();
	private ArrayList<ServicoManutencao> listServicosManutencao = new ArrayList<>();
	
	
	
	public void addProdutoDisponivel(ProdutoWEG produto) {
		listProdutosDisponiveis.add(produto);
	}
	
	public void rmvProduto(int index) {
		listProdutosDisponiveis.remove(index-1);
	}
	public void addServicoManutencao(ServicoManutencao servico) {
		listServicosManutencao.add(servico);
	}
	
	public ArrayList<ProdutoWEG> ArrListaProdutosDisponiveis() {
		return listProdutosDisponiveis;
	}
	
	public String listarProdutosDisponiveis() {
		
		String produtos = "";
		
		if(listProdutosDisponiveis.size() == 0 ) {
			return "Não há produtos adicionados!!";
		}
		
		for(int i = 0; i < listProdutosDisponiveis.size(); i++) {
			produtos = ""+ ((i+1)+" - Tipo/nome: "+listProdutosDisponiveis.get(i).getTipo() + " Código: "+listProdutosDisponiveis.get(i).getCodigo());
		}
		
		return produtos;
	}
	public ArrayList<ServicoManutencao> getListServicosManutencao() {
		return listServicosManutencao;
	}
	
}
