package powerUps;

import com.badlogic.gdx.graphics.Texture;

import utilitarios.Colisao;

public class BombaTiro  extends PowerUp{
	
	public BombaTiro(float x, float y, Colisao colisao) {
		super(x, y, colisao);
		this.imgPowerUp = new Texture("tiroBomba.png");
	}

	@Override
	public void ativarPowerUp() {
		colisao.getNave().setTipoTiro("Bomba");
	}

}
