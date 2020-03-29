package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import conexao.Conexao;
import negocio.Cliente;

public class ClienteDao {
	private static EntityManager _context;
	private static EntityTransaction _transaction;

	public static boolean Incluir(Cliente cliente) {
		_context = Conexao.ObterConexao();

		_transaction = _context.getTransaction();

		_transaction.begin();

		_context.persist(cliente);

		_transaction.commit();

		return true;
	}
}