package negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TBodyboard")
@PrimaryKeyJoinColumn(name = "ProdutoId", foreignKey = @ForeignKey(name = "FK_Produto_Bodyboard"))
public class Bodyboard extends ItemVenda {

	@Column(name = "Tamanho", nullable = false)
	private double Tamanho;

	@Column(name = "Preco", nullable = false)
	private float Preco;

	@Column(name = "Cor", nullable = false, length = 200)
	private String Cor;

	@Column(name = "Bloco", nullable = false, length = 200)
	private String Bloco;

	public Bodyboard() {

	}

	public Bodyboard(double tamanho, float preco, String cor, String bloco) {
		this();
		Tamanho = tamanho;
		Preco = preco;
		Cor = cor;
		Bloco = bloco;
	}

	public double getTamanho() {
		return Tamanho;
	}

	public void setTamanho(double tamanho) {
		Tamanho = tamanho;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getBloco() {
		return Bloco;
	}

	public void setBloco(String bloco) {
		Bloco = bloco;
	}

	@Override
	public String toString() {

		return String.format("%s - %s - %s - %f - %f", this.getBloco(), this.getCor(), this.getDescricao(),
				this.getPreco(), this.getTamanho());
	}
}