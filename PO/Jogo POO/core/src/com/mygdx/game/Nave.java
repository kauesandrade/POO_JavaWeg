package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;


public class Nave {
	
	private Texture imgNave = new Texture("nave.png");
	private Sprite nave = new Sprite(imgNave);
	
	private int escudos = 3;
	private float velocidade = 10;
	private float postX = 100;
	private float postY = 100;
	
	private Texture imgLazerVermelho = new Texture("lazerVermelho.png");
	private Sprite lazerVermelho = new Sprite(imgLazerVermelho);
	
	private boolean ataque = false;
	private float tiroX = postX;
	private float tiroY = postY;
	
	
	
	public boolean isAtaque() {
		return ataque;
	}
	public void setAtaque(boolean ataque1) {
		this.ataque = ataque1;
	}
	
	public float getTiroX() {
		return tiroX;
	}
	public void setTiroX(float tiroX) {
		this.tiroX = tiroX;
	}
	
	public float getTiroY() {
		return tiroY;
	}
	public void setTiroY(float tiroY) {
		this.tiroY = tiroY;
	}
	
	public Texture getImgLazerVermelho() {
		return imgLazerVermelho;
	}
	public void setImgLazerVermelho(Texture imgLazerVermelho) {
		this.imgLazerVermelho = imgLazerVermelho;
	}
	
	public Sprite getLazerVermelho() {
		return lazerVermelho;
	}
	public void setLazerVermelho(Sprite lazerVermelho) {
		this.lazerVermelho = lazerVermelho;
	}
	
	public Texture getImgNave() {
		return imgNave;
	}
	public void setImgNave(Texture imgNave) {
		this.imgNave = imgNave;
	}

	public Sprite getNave() {
		return nave;
	}
	public void setNave(Sprite nave) {
		this.nave = nave;
	}

	public int getEscudos() {
		return escudos;
	}
	public void setEscudos(int escudos) {
			this.escudos = escudos;
	}

	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public float getPostX() {
		return postX;
	}
	public void setPostX(float postX) {
		this.postX = postX;
	}

	public float getPostY() {
		return postY;
	}
	public void setPostY(float postY) {
		this.postY = postY;
	}
	
	public void moverNave() {
		if(postX < 1536 - nave.getWidth()) {
			if(Gdx.input.isKeyPressed(Input.Keys.D)) {
				this.postX += velocidade;
			}
		}
		if(postX > 0) {
			if(Gdx.input.isKeyPressed(Input.Keys.A)) {
				this.postX -= velocidade;
			}
		}
		if(postY < 864 - nave.getHeight()) {
			if(Gdx.input.isKeyPressed(Input.Keys.W)){
				this.postY += velocidade;
			}
		}
		if(postY > 0) {
			if(Gdx.input.isKeyPressed(Input.Keys.S)) {
				this.postY -= velocidade;
			}
		}
	
	}
	
	public void atirar() {
		
		if(Gdx.input.isKeyPressed(Input.Keys.SPACE) && !ataque) {
			ataque = true;
			tiroY = postY;
		}
		if(ataque) {
			if(tiroX < 1536) {
				tiroX += 5;
			}else {
				tiroX = postX;
				ataque = false;
			}
		}
		else {
			tiroX = postX;
			tiroY = postY;
		}
	}
	
	public void perderEscudo() {
		if(this.escudos > 0) {
			this.escudos--;
		}else if (this.escudos <= 0){
			//System.out.println("O jogo acabou");
		}
	}
	
}
