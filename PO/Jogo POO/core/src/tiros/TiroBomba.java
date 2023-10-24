package tiros;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Colisao;

public class TiroBomba extends Tiro {

	public TiroBomba(float x, float y, Colisao colisao) {
		super(x, y, colisao);
		imgTiro = new Texture("tiroBomba.png");
		velocidade = 5;
	}

}
