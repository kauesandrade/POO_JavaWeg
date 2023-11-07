package objetos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import utilitarios.Colisao;
import utilitarios.Spawn;



public class Meteoro {
	
	private Texture imgMeteoro = new Texture("meteoro.png");
	private Spawn spawn;

	public Meteoro(Colisao colisao) {
		spawn = new Spawn(imgMeteoro, colisao);
	}
	
	public void desenharMeteoro(SpriteBatch batch) {
		spawn.desenhar(batch);
	}
	public void spawnMeteoros() {
		spawn.spawn();
	}
	
	public void moverMeteoros() {
		spawn.moverX(499999999, 8);
	}

	public Texture getImgMeteoro() {
		return imgMeteoro;
	}

	public void setImgMeteoro(Texture imgMeteoro) {
		this.imgMeteoro = imgMeteoro;
	}
	
	
}
