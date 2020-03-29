package negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TBicicleta")
@PrimaryKeyJoinColumn(name = "ProdutoId", foreignKey = @ForeignKey(name = "FK_Produto_Bicicleta"))
public class Bicicleta extends ItemVenda {

	@Column(name = "Cor", nullable = false, length = 200)
	private String Cor;

	@Column(name = "TamanhoAro", nullable = false)
	private int TamanhoAro;

	@Column(name = "TamanhoQuadro", nullable = false)
	private double TamanhoQuadro;

	@Column(name = "Preco", nullable = false)
	private float Preco;

	public Bicicleta() {

	}

	public Bicicleta(String cor, int tamanhoAro, double tamanhoQuadro, float preco) {
		this();
		Cor = cor;
		TamanhoAro = tamanhoAro;
		TamanhoQuadro = tamanhoQuadro;
		Preco = preco;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getTamanhoAro() {
		return TamanhoAro;
	}

	public void setTamanhoAro(int tamanhoAro) {
		TamanhoAro = tamanhoAro;
	}

	public double getTamanhoQuadro() {
		return TamanhoQuadro;
	}

	public void setTamanhoQuadro(double tamanhoQuadro) {
		TamanhoQuadro = tamanhoQuadro;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %f - %d - %f", this.getCor(), this.getDescricao(), this.getPreco(),
				this.getTamanhoAro(), this.getTamanhoQuadro());
	}
}