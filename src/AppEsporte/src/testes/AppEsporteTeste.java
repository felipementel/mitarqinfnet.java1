package testes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.VendaDao;
import negocio.Bicicleta;
import negocio.Bodyboard;
import negocio.Cliente;
import negocio.ItemVenda;
import negocio.Skate;
import negocio.Venda;

public class AppEsporteTeste {

	public static void main(String[] args) {
		// TesteConexao();

		TestePreenchimentoPresistencia();
	}

	private static void TestePreenchimentoPresistencia() {

		Cliente _cliente = new Cliente();
		_cliente.setNome("Felipe");
		_cliente.setDDD(21);
		_cliente.setTelefone(984402668);
		_cliente.setEmail("felipementel@hotmail.com");
		_cliente.setAtivo(true);
		_cliente.setCadastro(new Date());

		System.out.printf("toString() Cliente: %s", _cliente);
		System.out.println("");

		Venda _venda = new Venda();

		_venda.setData(new Date());

		_venda.setCliente(_cliente);

		System.out.printf("toString() Venda: %s", _venda);
		System.out.println("");

		Skate _skate = new Skate();
		_skate.setDescricao("Skate longboard");
		_skate.setFabricante("Sector 9");
		_skate.setMaterialShape("Bambu");
		_skate.setPreco(999.99f);
		_skate.setTamanhoShape(40.6d);
		_skate.setVenda(_venda);

		System.out.printf("toString() Skate: %s", _skate);
		System.out.println("");

		Bicicleta _bicicleta = new Bicicleta();
		_bicicleta.setCor("Azul");
		_bicicleta.setDescricao("Montain bike");
		_bicicleta.setPreco(458.99f);
		_bicicleta.setTamanhoAro(700);
		_bicicleta.setTamanhoQuadro(19);
		_bicicleta.setVenda(_venda);

		System.out.printf("toString() Bicicleta: %s", _bicicleta);
		System.out.println("");

		Bodyboard _bodyboard = new Bodyboard();
		_bodyboard.setBloco("PP");
		_bodyboard.setCor("Preta");
		_bodyboard.setDescricao("Modelo GT 2020");
		_bodyboard.setPreco(999.20f);
		_bodyboard.setTamanho(42.5);
		_bodyboard.setVenda(_venda);

		System.out.printf("toString() Bodyboard: %s", _bodyboard);
		System.out.println("");

		List<ItemVenda> _itensVendidos = new ArrayList<ItemVenda>();
		_itensVendidos.add(_skate);
		_itensVendidos.add(_bicicleta);
		_itensVendidos.add(_bodyboard);

		_venda.setItensVenda(_itensVendidos);

		VendaDao.Incluir(_venda);

		System.out.println("Venda realizada com sucesso");
	}

	/*
	 * private static void TesteConexao() { if (Conexao.ObterConexao() != null) {
	 * System.out.println("Conexão realizada com sucesso"); } else {
	 * System.out.println("Falha na conexao"); } }
	 */
}