import java.util.ArrayList;

public class TestaAgenciaViagens {
	
	public static void main(String[] args) {
		
		AgenciaViagens novaViagens = new AgenciaViagens();
		
		ArrayList<Lugar> destinos; 
		
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome("Viajanete_01");
		novaPessoa.setCpf("000.111.222-3");
		
		Lugar novoLugar = new Lugar();
		novoLugar.setDestino("Curitiba");
		novoLugar.setPessoa(novaPessoa);
		
		
		Pessoa novaPessoa2 = new Pessoa();
		novaPessoa2.setNome("Viajanete_2");
		novaPessoa2.setCpf("000.111.222-4");
		
		Lugar novoLugar2 = new Lugar();
		novoLugar2.setDestino("Intamonhagaba");
		novoLugar2.setPessoa(novaPessoa2);
		
		novaViagens.adicionarViagem(novoLugar);
		novaViagens.adicionarViagem(novoLugar2);
		
		novaViagens.listarDadosPessoa("000.111.222-3");
		novaViagens.listarDadosPessoa("000.111.222-4");
		
		novaViagens.listarDadosDestino();
		
	}

}
