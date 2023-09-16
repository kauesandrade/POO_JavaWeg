package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import java.util.Iterator ;


public class Meteoro {
	
	Array<Rectangle> meteoros = new Array<Rectangle>();
	private Texture imgMeteoro = new Texture("meteoro.png");
	
	public void spawnMeteoros() {
		Rectangle meteoro = new Rectangle(1536 - imgMeteoro.getWidth(), MathUtils.random(0, 864 - imgMeteoro.getHeight()), imgMeteoro.getWidth(), imgMeteoro.getHeight());
		meteoros.add(meteoro);
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
