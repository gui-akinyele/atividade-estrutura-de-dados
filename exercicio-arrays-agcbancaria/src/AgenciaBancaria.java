import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AgenciaBancaria {

	public ArrayList<Conta> contas;

	HashSet<Pessoa> pessoas;

	public AgenciaBancaria() {

		pessoas = new HashSet<Pessoa>();

		contas = new ArrayList<Conta>();
	}

	public void adicionarConta(Conta novaConta) {

		contas.add(novaConta);
		pessoas.add(novaConta.getPessoa());

	}

	public void apagarConta(int numeroConta) {

		for (int indice = 0; indice < contas.size(); indice++) {

			Conta contaAtual = contas.get(indice);

			if (numeroConta == contaAtual.getNumeroConta()) {

				contas.remove(indice);

			}

		}

	}

	public void listarDadosPessoa(String cpf) {

		Iterator<Pessoa> it = pessoas.iterator();
		while (it.hasNext()) {
			Pessoa pessoaAtual = it.next();
			if (cpf == pessoaAtual.getCpf()) {
				System.out.println(pessoaAtual.getNome() + " " + pessoaAtual.getCpf());
			}

		}

	}

	public ArrayList<Conta> buscaTodasContas() {

		return contas;
	}
}