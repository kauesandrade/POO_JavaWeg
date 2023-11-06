package powerUps;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import utilitarios.Colisao;
import utilitarios.Spawn;

public class PowerUp  {
	
	protected Texture imgPowerUp = new Texture("escudo1.png"); // PRECISA REMOVER QUANDO FOR FAZER AS CLASES E BOTAR LA E 
//	fazer a nava receber escuda na clase escudo
	protected float PowerUpY;
	protected float PowerUpX;
	protected float velocidade = 5; // PRECISA REMOVER QUANDO FOR FAZER AS CLASES E BOTAR LA
	protected boolean remover = false;
	private Colisao colisao;
	
	public PowerUp(float x, float y, Colisao colisao) {
		this.PowerUpX = x;
		this.PowerUpY = y;
		this.colisao = colisao;
	}
	
	
	public Texture getImgPowerUp() {
		return imgPowerUp;
	}

	public void setImgPowerUp(Texture imgTiro) {
		this.imgPowerUp = imgTiro;
	}

	public float getPowerUpY() {
		return PowerUpY;
	}

	public void setPowerUpY(float tiroY) {
		this.PowerUpY = tiroY;
	}

	public float getPowerUpX() {
		return PowerUpX;
	}

	public void setPowerUpX(float tiroX) {
		this.PowerUpX = tiroX;
	}

	public void setRemover(boolean remover) {
		this.remover = remover;
	}

	public boolean isRemover() {
		return remover;
	}
	
	
	public void update() {
		PowerUpX -= velocidade;
		if(PowerUpX < 0 || colisao.colisaNavePowerUp(PowerUpX, PowerUpY, imgPowerUp)) {
			remover = true;
		}
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(imgPowerUp, PowerUpX, PowerUpY);
	}

	
}
