package powerUps;

import com.badlogic.gdx.graphics.Texture;

import utilitarios.Colisao;

public class Escudo  extends PowerUp{

	public Escudo(float x, float y, Colisao colisao) {
		super(x, y, colisao);
		this.imgPowerUp = new Texture("escudo.png");
	}

	@Override
	public void ativarPowerUp() {
		colisao.getNave().ganharEscudo();
	}
	
}
