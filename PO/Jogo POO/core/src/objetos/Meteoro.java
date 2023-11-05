package objetos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Predicate;
import com.badlogic.gdx.utils.TimeUtils;

import utilitarios.Colisao;
import utilitarios.Spawn;

import java.util.Iterator ;


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
