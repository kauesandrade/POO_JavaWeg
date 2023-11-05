package com.mygdx.game;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class Alien {

	private Texture imgAlien = new Texture("alien.png");
	private Spawn spawn;
	private String tipo;
	private int escudo;
	private int postX;
	private int postY;
	
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
