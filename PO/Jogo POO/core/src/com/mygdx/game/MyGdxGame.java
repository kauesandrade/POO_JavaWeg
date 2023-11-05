package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

import objetos.Alien;
import objetos.Meteoro;
import objetos.Nave;
import powerUps.PowerUp;
import utilitarios.Colisao;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.Color;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Nave nave;
	Meteoro meteoro;
	Alien alien;
	Colisao colisao;
	PowerUp powerUp;
	float ultimoNanoTime;
	int pontos;
	int time;
	
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
		
		batch = new SpriteBatch();
		img = new Texture("space.png");
		nave = new Nave(colisao);
		colisao = new Colisao(nave, meteoro, alien);
		meteoro = new Meteoro(colisao);
		alien = new Alien(colisao);
		powerUp = new PowerUp(colisao);
		
		time = 999999999;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(nave.getNave(), nave.getPostX() , nave.getPostY());
		
		bitMap.draw(batch, "Pontos: " + pontos, 40, Gdx.graphics.getHeight() - 40);
		if(TimeUtils.nanoTime() - ultimoNanoTime > time) {
			pontos += 10;
			ultimoNanoTime = TimeUtils.nanoTime();
			if(pontos % 100 == 0) {
				time-=10000;
			}
		}
		
		meteoro.moverMeteoros();
		meteoro.desenharMeteoro(batch);
		alien.moverAlien();
		alien.desenharAlien(batch);
		powerUp.moverMeteoros();
		powerUp.desenharMeteoro(batch);
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
