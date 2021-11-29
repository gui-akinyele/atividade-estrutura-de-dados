
public class TestaConcessionaria {

	public static void main(String[] args) {

		Carro novoCarro = new Carro();

		novoCarro.setPlaca("ABC-1234");
		novoCarro.setPreco(2000.0);
		novoCarro.setModelo("Gol");

		Carro novoCarro2 = new Carro();
		novoCarro2.setModelo("Astra");
		novoCarro2.setPlaca("DEF-5678");
		novoCarro2.setPreco(3000.0);

		Carro novoCarro3 = new Carro();
		novoCarro3.setModelo("Palio");
		novoCarro3.setPlaca("GHI-9012");
		novoCarro3.setPreco(4000.0);

		Concessionaria testaLoja = new Concessionaria();

		testaLoja.addCarro(novoCarro);
		testaLoja.addCarro(novoCarro2);
		testaLoja.addCarro(novoCarro3);

		testaLoja.listarCarros();
		
		testaLoja.tabelaPreco();
		
		testaLoja.listarDadosCarros("SDE-1234");
	}

}
