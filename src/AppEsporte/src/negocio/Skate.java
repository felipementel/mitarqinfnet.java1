
package negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TSkate")
@PrimaryKeyJoinColumn(name = "ProdutoId", foreignKey = @ForeignKey(name = "FK_Produto_Skate"))
public class Skate extends ItemVenda {

	@Column(name = "MaterialShape", nullable = false, length = 200)
	private String MaterialShape;

	@Column(name = "TamanhoShape", nullable = false)
	private double TamanhoShape;

	@Column(name = "Fabricante", nullable = false, length = 200)
	private String Fabricante;

	@Column(name = "Preco", nullable = false)
	private float Preco;

	public Skate() {

	}

	public Skate(String materialShape, double tamanhoShape, String fabricante, float preco) {
		this();
		MaterialShape = materialShape;
		TamanhoShape = tamanhoShape;
		Fabricante = fabricante;
		Preco = preco;
	}

	public String getMaterialShape() {
		return MaterialShape;
	}

	public void setMaterialShape(String materialShape) {
		MaterialShape = materialShape;
	}

	public double getTamanhoShape() {
		return TamanhoShape;
	}

	public void setTamanhoShape(double tamanhoShape) {
		TamanhoShape = tamanhoShape;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	@Override
	public String toString() {

		return String.format("%s - %s - %s - %f - %f", this.getDescricao(), this.getFabricante(),
				this.getMaterialShape(), this.getTamanhoShape(), this.getPreco());
	}
}
