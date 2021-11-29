import java.util.ArrayList;

public class TestaAgenciaBancaria {

	public static void main(String[] args) {
		
		AgenciaBancaria novaAgencia = new AgenciaBancaria();
		
		ArrayList<Conta> contas; 
		
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome("Cliente_1");
		novaPessoa.setCpf("000.111.222-3");
	
		Conta novaConta = new Conta();
		novaConta.setNumeroConta(1);
		novaConta.setPessoa(novaPessoa);
		
		novaAgencia.adicionarConta(novaConta);
		
		novaAgencia.listarDadosPessoa("000.111.222-3");
		
		
		Pessoa novaPessoa2 = new Pessoa();
		novaPessoa2.setNome("Cliente_2");
		novaPessoa2.setCpf("000.111.222-4");
	
		Conta novaConta2 = new Conta();
		novaConta2.setNumeroConta(2);
		novaConta2.setPessoa(novaPessoa2);
		
		novaAgencia.adicionarConta(novaConta2);
	
		
		contas = novaAgencia.buscaTodasContas();
		System.out.println(contas.size());
		
		novaAgencia.apagarConta(1);
		
		contas = novaAgencia.buscaTodasContas();
		System.out.println(contas.size());
		
		
		
	}

}
