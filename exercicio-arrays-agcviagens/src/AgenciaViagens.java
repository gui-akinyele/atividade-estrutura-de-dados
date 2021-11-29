import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class AgenciaViagens {
	
	public ArrayList<Lugar> destinos;
	
	HashSet<Pessoa> pessoas;
	
	public AgenciaViagens() {
		
		pessoas = new HashSet<Pessoa>();
		
		destinos = new ArrayList<Lugar>();
	}
	
	public void adicionarViagem (Lugar novoLugar) {

		destinos.add(novoLugar);
		pessoas.add(novoLugar.getPessoa());
		
	}
	
	
	public void listarDadosDestino() {

		for (int indice = 0; indice < destinos.size(); indice++) {

			Lugar destinoAtual = destinos.get(indice);

			System.out.println("O destino é : " + destinoAtual.getDestino());
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

	
	

}
