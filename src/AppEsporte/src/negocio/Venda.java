package negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TVenda")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer VendaId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Data", nullable = false)
	private Date Data;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "ClienteId", nullable = false, foreignKey = @ForeignKey(name = "FK_Cliente_Venda"))
	private Cliente Cliente;

	public List<ItemVenda> getItensVenda() {
		return ItensVenda;
	}

	public void setItensVenda(List<ItemVenda> itensVenda) {
		ItensVenda = itensVenda;
	}

	@OneToMany(mappedBy = "Venda", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<ItemVenda> ItensVenda;

	public Venda() {

	}

	public Venda(Integer vendaId, Date data, negocio.Cliente cliente, List<ItemVenda> itensVenda) {
		this();
		VendaId = vendaId;
		Data = data;
		Cliente = cliente;
		ItensVenda = itensVenda;
	}

	public Integer getVendaId() {
		return VendaId;
	}

	public void setVendaId(Integer vendaId) {
		VendaId = vendaId;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		return String.format("Data da venda: %s", dateFormat.format(this.getData()));
	}
}