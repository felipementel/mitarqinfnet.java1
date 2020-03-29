package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import conexao.Conexao;
import negocio.ItemVenda;

public class ItemVendaDao {
	private static EntityManager _context;
	private static EntityTransaction _transaction;

	public static boolean Incluir(ItemVenda itemVenda) {
		_context = Conexao.ObterConexao();

		_transaction = _context.getTransaction();

		_transaction.begin();

		_context.persist(itemVenda);

		_transaction.commit();

		return true;
	}
}