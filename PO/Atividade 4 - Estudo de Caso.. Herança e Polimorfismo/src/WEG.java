import java.util.ArrayList;

public class WEG {
	private ArrayList<ProdutoWEG> listProdutosDisponiveis = new ArrayList<>();
	private ArrayList<ServicoManutencao> listServicosManutencao = new ArrayList<>();
	
	
	
	public void addProdutoDisponivel(ProdutoWEG produto) {
		listProdutosDisponiveis.add(produto);
	}
	public void addServicoManutencao(ServicoManutencao servico) {
		listServicosManutencao.add(servico);
	}
	
	public ArrayList<ProdutoWEG> listarProdutosDisponiveis() {
		return listProdutosDisponiveis;
	}
	public ArrayList<ServicoManutencao> getListServicosManutencao() {
		return listServicosManutencao;
	}
	
}
