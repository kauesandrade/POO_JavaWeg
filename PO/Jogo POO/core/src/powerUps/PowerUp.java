package powerUps;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import utilitarios.Colisao;
import utilitarios.Spawn;

public class PowerUp  {
	
	private Texture imgPowerUp = new Texture("lazerVermelho.png");
	private Spawn spawn;

	public PowerUp(Colisao colisao) {
		spawn = new Spawn(imgPowerUp, colisao);
	}
	
	public void desenharMeteoro(SpriteBatch batch) {
		spawn.desenhar(batch);
	}
	public void spawnMeteoros() {
		spawn.spawn();
	}
	
	public void moverMeteoros() {
		spawn.moverXPowerUps(99999999999.0, 4);
	}

	public Texture getImgMeteoro() {
		return imgPowerUp;
	}

	public void setImgMeteoro(Texture imgMeteoro) {
		this.imgPowerUp = imgMeteoro;
	}

	
}
