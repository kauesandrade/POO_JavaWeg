package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Atirar {
	
	protected String textura = "nave.png";
	private Texture imgTiro = new Texture(textura);
	protected float tiroY;
	protected float tiroX;
	protected float velocidade = 20;
	protected boolean remover = false;
	
	public Atirar(float x, float y) {
		this.tiroX =  x;
		this.tiroY = y;
	}
	
	public void update() {
		tiroX += velocidade;
		if(tiroX > 1536) {
			remover = true;
		}
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(imgTiro, tiroX, tiroY);
	}
}