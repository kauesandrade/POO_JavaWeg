package tiros;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Colisao;

public class TiroNormal extends Tiro{
	
		
	public TiroNormal(float x, float y, Colisao colisao) {
		super(x, y, colisao);
		imgTiro = new Texture("lazerVermelho.png");
		velocidade = 20;
	}
	
	

}
