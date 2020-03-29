package negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TItemVenda")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemVenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProdutoId;

	@Column(name = "Descricao", nullable = false, length = 200)
	private String Descricao;

	@ManyToOne
	@JoinColumn(name = "VendaId", foreignKey = @ForeignKey(name = "FK_Venda_ItemVenda"), nullable = false)
	private Venda Venda;

	public ItemVenda() {

	}

	public ItemVenda(int produtoId, String descricao) {
		this();
		setProdutoId(produtoId);
		setDescricao(descricao);
	}

	public ItemVenda(int produtoId, String descricao, negocio.Venda venda) {
		this();
		ProdutoId = produtoId;
		Descricao = descricao;
		Venda = venda;
	}

	public int getProdutoId() {
		return ProdutoId;
	}

	public void setProdutoId(int produtoId) {
		ProdutoId = produtoId;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Venda getVenda() {
		return Venda;
	}

	public void setVenda(Venda venda) {
		Venda = venda;
	}

	@Override
	public String toString() {

		return String.format("%d - %s",
				this.getProdutoId(),
				this.getDescricao());
	}
}