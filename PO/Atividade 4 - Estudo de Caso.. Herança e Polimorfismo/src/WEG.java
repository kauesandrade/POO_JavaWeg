import java.util.ArrayList;

/**
 * Classe que representa uma entidade WEG, contendo listas de produtos
 * disponíveis e serviços de manutenção.
 */
public class WEG {

	private ArrayList<ProdutoWEG> listProdutosDisponiveis = new ArrayList<>();
	private ArrayList<ServicoManutencao> listServicosManutencao = new ArrayList<>();

	/**
	 * Adiciona um produto à lista de produtos disponíveis.
	 *
	 * @param produto O produto a ser adicionado.
	 */
	public void addProdutoDisponivel(ProdutoWEG produto) {
		listProdutosDisponiveis.add(produto);
	}

	/**
	 * Remove um produto da lista de produtos disponíveis com base no índice
	 * fornecido.
	 *
	 * @param index O índice do produto a ser removido.
	 */
	public void rmvProduto(int index) {
		listProdutosDisponiveis.remove(index - 1);
	}

	/**
	 * Adiciona um serviço de manutenção à lista de serviços e associa-o a um
	 * produto específico.
	 *
	 * @param servico O serviço de manutenção a ser adicionado.
	 * @param index   O índice do produto ao qual o serviço será associado.
	 */
	public void addServicoManutencao(ServicoManutencao servico, int index) {
		listServicosManutencao.add(servico);
		listProdutosDisponiveis.get(index - 1).setServico(servico);
	}

	/**
	 * Lista os produtos disponíveis no formato de string.
	 *
	 * @return Uma string contendo a lista de produtos disponíveis.
	 */
	public String listarProdutosDisponiveis() {
		String produtos = "";

		if (listProdutosDisponiveis.size() == 0) {
			return "Não há produtos adicionados!!";
		} else {
			for (int i = 0; i < listProdutosDisponiveis.size(); i++) {
				produtos = produtos + ((i + 1) + " - Tipo/nome: " + listProdutosDisponiveis.get(i).getTipo()
						+ " Código: " + listProdutosDisponiveis.get(i).getCodigo() + "\n");
			}
		}

		return produtos;
	}

	/**
	 * Lista os serviços de manutenção associados aos produtos disponíveis no
	 * formato de string.
	 *
	 * @return Uma string contendo a lista de serviços de manutenção associados aos
	 *         produtos disponíveis.
	 */
	public String listarServicosManutencao() {
		String servicos = "";

		if (listServicosManutencao.size() == 0) {
			return "Não há produtos adicionados!!";
		} else {
			for (int i = 0; i < listProdutosDisponiveis.size(); i++) {
				if (listProdutosDisponiveis.get(i).getServico() != null)
					servicos = servicos + ((i + 1) + " - " + listProdutosDisponiveis.get(i).getTipo() + " custo: "
							+ listProdutosDisponiveis.get(i).getServico().getCusto() + " descrição: "
							+ listProdutosDisponiveis.get(i).getServico().getDescricao() + "\n");
			}
		}

		return servicos;
	}

	/**
	 * Obtém a lista de serviços de manutenção.
	 *
	 * @return A lista de serviços de manutenção.
	 */
	public ArrayList<ServicoManutencao> getArrListServicosManutencao() {
		return listServicosManutencao;
	}

	/**
	 * Obtém a lista de produtos disponíveis.
	 *
	 * @return A lista de produtos disponíveis.
	 */
	public ArrayList<ProdutoWEG> getArrListaProdutosDisponiveis() {
		return listProdutosDisponiveis;
	}
}
