package objetos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import utilitarios.Colisao;
import utilitarios.Spawn;

public class Alien {

	private Texture imgAlien = new Texture("alien.png");
	private Spawn spawn;
	
	public Alien(Colisao colisao) {
		spawn = new Spawn(imgAlien, colisao);
	}

	public void atirar() {
		
	}
	public void desenharAlien(SpriteBatch batch) {
		spawn.desenhar(batch);
	}
	public void spawnAlien() {
		spawn.spawn();
	}
	
	public void moverAlien() {
		spawn.moverY(999999999, 4);
	}

	public Texture getImgAlien() {
		return imgAlien;
	}

	public void setImgAlien(Texture imgAlien) {
		this.imgAlien = imgAlien;
	}
	
}
