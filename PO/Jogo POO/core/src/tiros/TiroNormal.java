package tiros;

import com.badlogic.gdx.graphics.Texture;

public class TiroNormal extends Tiro{
	
		
	public TiroNormal(float x, float y) {
		super(x, y);
		imgTiro = new Texture("lazerVermelho.png");
		velocidade = 20;
	}
	
	

}
