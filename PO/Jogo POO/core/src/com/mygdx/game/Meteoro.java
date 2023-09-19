package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Predicate;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator ;


public class Meteoro {
	
	Array<Rectangle> meteoros = new Array<Rectangle>();
	private Texture imgMeteoro = new Texture("meteoro.png");
	private long ultimoNanoTime = 0;
	private Nave nave =  new Nave();
	
	public void setNave(Nave nave) {
		this.nave = nave;
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
			if(colicao(meteoro.x, meteoro.y, meteoro.height, meteoro.width, nave.getTiroX(), nave.getTiroY(), nave.getLazerVermelho().getHeight() , nave.getImgLazerVermelho().getWidth())) {
				iter.remove();
			}
		}
	}
	
	public boolean colicao(float x1, float y1, float h1, float w1, float x2, float y2, float h2, float w2) {
		if(x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
			return true;
		}
		return false;
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
