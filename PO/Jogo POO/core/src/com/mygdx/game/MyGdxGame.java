package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Nave nave;
	Meteoro meteoro;
	Texture img;
	
	@Override
	public void create () {
		nave = new Nave();
		batch = new SpriteBatch();
		img = new Texture("space.png");
		meteoro = new Meteoro();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(nave.getLazerVermelho(), nave.getTiroX() , nave.getTiroY());
		batch.draw(nave.getNave(), nave.getPostX() , nave.getPostY());
		for(Rectangle m : meteoro.getMeteoros()) {
			batch.draw(meteoro.getImgMeteoro(), m.x, m.y);
		}
		meteoro.spawnMeteoros();
		nave.moverNave();
		nave.atirar();
		batch.end();
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
}
