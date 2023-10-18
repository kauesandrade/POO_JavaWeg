package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

import tiros.Tiro;
import tiros.TiroBomba;
import tiros.TiroNormal;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Gdx;


public class Nave {
	
	private Texture imgNave = new Texture("nave.png");
	private Sprite nave = new Sprite(imgNave);
	
	private int escudos = 3;
	private float velocidade = 10;
	private float postX = 100;
	private float postY = 100;	
	
	private Array<Tiro> arrTiros = new Array<>();
	private String tipoTiro = "Normal" ;
	
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
	public Array<Tiro> getArrTiros() {
		return arrTiros;
	}
	public void setArrTiros(Array<Tiro> arrTiros) {
		this.arrTiros = arrTiros;
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
		
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
			if(arrTiros.size < 5) {
				switch (tipoTiro) {
				case "Normal":
					arrTiros.add(new TiroNormal(postX, postY));
					break;
				case "Bomba":
					arrTiros.add(new TiroBomba(postX, postY));
					break;
				}
			}
		}
	}
	
	public void renderBalas(SpriteBatch batch) {
		for(Tiro tiro : arrTiros) {
			tiro.render(batch);
		}
	}
	
	public void removerBalas() {
		Array<Tiro> removerTiros = new Array<>();
		for(Tiro tiro : arrTiros) {
			tiro.update();
			if(tiro.isRemover()) {
				removerTiros.add(tiro);
			}

		}	
		arrTiros.removeAll(removerTiros, false);
		
	}
	
	public void perderEscudo() {
		if(this.escudos > 0) {
			this.escudos--;
		}else if (this.escudos <= 0){
			System.out.println("O jogo acabou");
		}
	}
	
}
