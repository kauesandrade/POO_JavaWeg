package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.Color;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Nave nave;
	Meteoro meteoro;
	Texture img;
	
	private FreeTypeFontGenerator gerador;
	private FreeTypeFontGenerator.FreeTypeFontParameter parametro;
	private BitmapFont bitMap;
	
	@Override
	public void create () {
		gerador = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		parametro = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parametro.size = 30;
		parametro.borderWidth = 1;
		parametro.borderColor = Color.BLACK;
		parametro.color = Color.WHITE;
		bitMap = gerador.generateFont(parametro);
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
		batch.draw(nave.getNave(), nave.getPostX() , nave.getPostY());
		for(Rectangle m : meteoro.getMeteoros()) {
			batch.draw(meteoro.getImgMeteoro(), m.x, m.y);
		}
		meteoro.moverMeteoros();
		meteoro.setNave(nave);
		nave.moverNave();
		nave.atirar();
		nave.renderBalas(batch);
		nave.removerBalas();
	
		batch.end();
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
