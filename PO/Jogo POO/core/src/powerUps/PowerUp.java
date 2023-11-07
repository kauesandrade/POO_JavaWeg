package powerUps;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import utilitarios.Colisao;

public class PowerUp  {
	
	protected Texture imgPowerUp;
	protected float PowerUpY;
	protected float PowerUpX;
	protected float velocidade = 5;
	protected boolean remover = false;
	protected boolean pegou = false;
	protected Colisao colisao;
	
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
	
	public boolean isPegou() {
		return pegou;
	}

	public void setPegou(boolean pegou) {
		this.pegou = pegou;
	}


	public void update() {
		PowerUpX -= velocidade;
		if(PowerUpX < 0 || colisao.colisaNavePowerUp(PowerUpX, PowerUpY, imgPowerUp)){
			if(colisao.colisaNavePowerUp(PowerUpX, PowerUpY, imgPowerUp)){
				pegou = true;
			}
			remover = true;
		}
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(imgPowerUp, PowerUpX, PowerUpY);
	}


	public void ativarPowerUp() {
		
	}

	
}
