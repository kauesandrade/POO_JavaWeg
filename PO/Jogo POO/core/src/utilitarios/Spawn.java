package utilitarios;

import java.util.Iterator;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

import powerUps.BombaTiro;
import powerUps.Escudo;
import powerUps.PowerUp;

public class Spawn {

	private Array<Rectangle> rectangles = new Array<Rectangle>();
	private Texture img;
	private Colisao colisao = new Colisao();

	private float ultimoNanoTime = 0;

	private Array<PowerUp> arrPowerUps = new Array<>();
	
	public Array<PowerUp> getArrPowerUps() {
		return arrPowerUps;
	}

	public void setArrPowerUps(Array<PowerUp> arrPowerUps) {
		this.arrPowerUps = arrPowerUps;
	}
	
	public Spawn(Texture img, Colisao colisao) {
		this.img = img;
		this.colisao = colisao;
	}

	public Spawn(Colisao colisao) {
		this.colisao = colisao;
	}

	public void desenhar(SpriteBatch batch) {
		for (Rectangle r : rectangles) {
			batch.draw(img, r.x, r.y);
		}
	}

	public void spawn() {
		Rectangle r = new Rectangle(1536 - img.getWidth(), MathUtils.random(0, 864 - img.getHeight()), img.getWidth(),
				img.getHeight());
		rectangles.add(r);
		ultimoNanoTime = TimeUtils.nanoTime();
	}

	public void moverX(int time, int velocidade) {

		if (TimeUtils.nanoTime() - ultimoNanoTime > time) {
			this.spawn();
		}

		for (Iterator<Rectangle> iter = rectangles.iterator(); iter.hasNext();) {
			Rectangle r = iter.next();
			r.x -= velocidade;
			if (r.x + r.getWidth() < 0 || colisao.colisaoRectangleNave(r) || colisao.colisaoTiro(r)) {
				iter.remove();
			}

		}
	}

	public void moverY(long time, int velocidade) {
		if (TimeUtils.nanoTime() - ultimoNanoTime > time * 9) {
			this.spawn();
		}
		for (Iterator<Rectangle> iter = rectangles.iterator(); iter.hasNext();) {
			Rectangle r = iter.next();

			if (colisao.colisaoRectangleNave(r) || colisao.colisaoTiro(r)) {
				iter.remove();
			}
		}
	}
	
	public void spawnPowerUps(String tipo) {
		switch (tipo) {
		case "escudo":
			arrPowerUps.add(new Escudo(1536, MathUtils.random(0 + 100, 864 - 100), colisao));
			break;
		case "tiroBomba":
			arrPowerUps.add(new BombaTiro(1536, MathUtils.random(0 + 100, 864 - 100), colisao));
			break;
		}
		
	}
	
	public void renderPowerUps(SpriteBatch batch) {
		for (PowerUp p : arrPowerUps) {
			p.render(batch);
		}
	}
	
	public void removerPowerUps() {
		Array<PowerUp> removerPowerUp = new Array<>();
		for (PowerUp p : arrPowerUps) {
			p.update();
			if (p.isRemover()) {
				if(p.isPegou()) {
					p.ativarPowerUp();
				}
				removerPowerUp.add(p);
			}

		}
		arrPowerUps.removeAll(removerPowerUp, false);

	}

}
