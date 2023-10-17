package tiros;

import com.badlogic.gdx.graphics.Texture;

public class TiroBomba extends Tiro {

	public TiroBomba(float x, float y) {
		super(x, y);
		imgTiro = new Texture("nave.png");
		velocidade = 100;
	}

}
