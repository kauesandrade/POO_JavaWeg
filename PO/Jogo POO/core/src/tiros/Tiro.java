package tiros;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Tiro{
	
	protected Texture imgTiro;
	protected float tiroY;
	protected float tiroX;
	protected float velocidade;
	protected boolean remover = false;
	
	public Tiro(float x, float y) {
		this.tiroX = x;
		this.tiroY = y;
	}
	
	
	public Texture getImgTiro() {
		return imgTiro;
	}

	public void setImgTiro(Texture imgTiro) {
		this.imgTiro = imgTiro;
	}

	public float getTiroY() {
		return tiroY;
	}

	public void setTiroY(float tiroY) {
		this.tiroY = tiroY;
	}

	public float getTiroX() {
		return tiroX;
	}

	public void setTiroX(float tiroX) {
		this.tiroX = tiroX;
	}

	public void setRemover(boolean remover) {
		this.remover = remover;
	}

	public boolean isRemover() {
		return remover;
	}
	
	
	public void update() {
		tiroX += velocidade;
		if(tiroX > 1536) {
			remover = true;
		}
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(imgTiro, tiroX, tiroY);
	}
}