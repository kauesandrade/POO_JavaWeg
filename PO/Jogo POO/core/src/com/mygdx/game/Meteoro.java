package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Predicate;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator ;


public class Meteoro {
	
	private Array<Rectangle> meteoros = new Array<Rectangle>();
	private Texture imgMeteoro = new Texture("meteoro.png");
	private long ultimoNanoTime = 0;

	public void desenharMeteoro(SpriteBatch batch) {
		for(Rectangle m : meteoros) {
			batch.draw(imgMeteoro, m.x, m.y);
		}
	}

	public void spawnMeteoros() {
		Rectangle meteoro = new Rectangle(1536 - imgMeteoro.getWidth(), MathUtils.random(0, 864 - imgMeteoro.getHeight()), imgMeteoro.getWidth(), imgMeteoro.getHeight());
		meteoros.add(meteoro);
		ultimoNanoTime = TimeUtils.nanoTime();
	}
	
	public void moverMeteoros() {
		
		if(TimeUtils.nanoTime() - ultimoNanoTime > 999999999) {
			this.spawnMeteoros();
		}

		for( Iterator<Rectangle> iter = meteoros.iterator(); iter.hasNext();) {
			Rectangle meteoro = iter.next();
			meteoro.x -= 8;
			if(meteoro.x + meteoro.getWidth() < 0) {
				iter.remove();
			}
			
		}
	}

	public Array<Rectangle> getMeteoros() {
		return meteoros;
	}

	public Texture getImgMeteoro() {
		return imgMeteoro;
	}

	public void setImgMeteoro(Texture imgMeteoro) {
		this.imgMeteoro = imgMeteoro;
	}
	
	
}
