package powerUps;

import com.badlogic.gdx.graphics.Texture;

import utilitarios.Colisao;

public class Escudo  extends PowerUp{

	public Escudo(float x, float y, Colisao colisao) {
		super(x, y, colisao);
		this.imgPowerUp = new Texture("escudo1.png");
	}


}
