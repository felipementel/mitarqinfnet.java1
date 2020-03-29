package conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private static EntityManager _entityManager = null;

	public static EntityManager ObterConexao() {

		if (_entityManager == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("AppEsporte");

			_entityManager = factory.createEntityManager();
		}
		return _entityManager;
	}
}