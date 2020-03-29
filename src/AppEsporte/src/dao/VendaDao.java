package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import conexao.Conexao;
import negocio.Venda;

public class VendaDao {
	private static EntityManager _context;
	private static EntityTransaction _transaction;

	public static boolean Incluir(Venda venda) {
		_context = Conexao.ObterConexao();

		_transaction = _context.getTransaction();

		_transaction.begin();

		_context.persist(venda);

		_transaction.commit();

		return true;
	}
}