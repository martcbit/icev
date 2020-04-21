package Lista05.Agenda;

public class BaseDeDados {

	Contato[] contatos;
	int numContatos;

	public BaseDeDados() {
		contatos = new Contato[100];
		numContatos = 0;
	}

	void adicionar(PessoaFisica novoContato) {
		// TODO adicionar
		contatos[numContatos] = novoContato;
		numContatos++;
	}
	
	void adicionar(PessoaJuridica novoContato) {
		// TODO adicionar
		contatos[numContatos] = novoContato;
		numContatos++;
	}

	Contato buscar(int posicao) {
		return contatos[posicao];
	}

	Contato buscar(String nome) {
		// TODO buscar
		for (int posicao = 0; posicao < contatos.length; posicao++) {
			Contato contatoPosicaoAtual = contatos[posicao];
			if (contatoPosicaoAtual == null)
				continue;
			else if (contatoPosicaoAtual.getNome().equals(nome)) {
				return contatoPosicaoAtual;
			}
		}
		return null;
	}

	void alterarNome(int posicao, String novoNome) {
		contatos[posicao].setNome(novoNome);
	}

	void alterarEndereco(int posicao, String novoEndereco) {
		contatos[posicao].setEndereco(novoEndereco);
	}

	void alterarTelefone(int posicao, String novoTelefone) {
		contatos[posicao].setTelefone(novoTelefone);
	}

	void remover(int posicao) {
		contatos[posicao] = null;
		numContatos--;
	}

}
