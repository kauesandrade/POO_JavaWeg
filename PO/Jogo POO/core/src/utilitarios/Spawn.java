package utilitarios;

import java.util.Iterator;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

public class Spawn {
	
	private Array<Rectangle> rectangles = new Array<Rectangle>();
	private float ultimoNanoTime = 0;
	private Texture img;
	private Colisao colisao = new Colisao();
//	private boolean baixo = true;
	
	public Spawn(Texture img, Colisao colisao) {
		this.img = img;
		this.colisao = colisao;
	}

	public void desenhar(SpriteBatch batch) {
		for(Rectangle r : rectangles) {
			batch.draw(img, r.x, r.y);
		}
	}

	public void spawn() {
		Rectangle r = new Rectangle(1536 - img.getWidth(), MathUtils.random(0, 864 - img.getHeight()), img.getWidth(), img.getHeight());
		rectangles.add(r);
		ultimoNanoTime = TimeUtils.nanoTime();
	}
	
	public void moverX(int time, int velocidade) {
		
		if(TimeUtils.nanoTime() - ultimoNanoTime > time) {
			this.spawn();
		}

		for( Iterator<Rectangle> iter = rectangles.iterator(); iter.hasNext();) {
			Rectangle r = iter.next();
			r.x -= velocidade;
			if(r.x + r.getWidth() < 0 || colisao.colisaoRectangleNave(r) || colisao.colisaoTiro(r)) {
				iter.remove();
			}
			
		}
	}
	
	public String moverXPowerUps(double time, int velocidade) {
		
		if(TimeUtils.nanoTime() - ultimoNanoTime > time) {
			this.spawn();
		}

		for( Iterator<Rectangle> iter = rectangles.iterator(); iter.hasNext();) {
			Rectangle r = iter.next();
			r.x -= velocidade;
			if(r.x + r.getWidth() < 0 || colisao.colisaoNavePoweup(r)) {
				iter.remove();
				return "a";
			}
		}
		return "";
		
	}
	
	public void moverY(long time, int velocidade) {
		if(TimeUtils.nanoTime() - ultimoNanoTime > time*9) {
			this.spawn();
		}
		for( Iterator<Rectangle> iter = rectangles.iterator(); iter.hasNext();) {
			Rectangle r = iter.next();
		
//			if(!baixo) {
//				r.y += velocidade;
//			}else if(baixo) {
//				r.y -= velocidade;
//			}
//			if(r.y < -140) {
//				baixo = false;
//			}else if(r.y > 600) {
//				baixo = true;
//			}
			
			if(colisao.colisaoRectangleNave(r) || colisao.colisaoTiro(r)) {
				iter.remove();
			}
		}
	}

}
