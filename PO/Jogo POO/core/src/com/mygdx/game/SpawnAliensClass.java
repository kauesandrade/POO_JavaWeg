package com.mygdx.game;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class SpawnAliensClass {
	
	private Array<Alien> ArrAlien = new Array<Alien>();
	
	

//	private Array<Alien> ArrAlien = new Array<Alien>();
//	private Nave nave = new Nave ();
//	
//	private int pontos = 0;
//	
//	public void setNave(Nave nave) {
//		this.nave = nave;
//	}
//
//	
//	public void spawnAlien() {
//		Rectangle alien = new Rectangle(1536 - imgAlien.getWidth(), MathUtils.random(0, 864 - imgAlien.getHeight()), imgAlien.getWidth(), imgAlien.getHeight());
//		aliens.add(alien); 
//	}
//	
//	public void spawn() {
//		
//		
//		if(Gdx.input.isKeyJustPressed(Input.Keys.P)) {
//			spawnAlien();
//		}
//
//		
//	for( Iterator<Rectangle> iter = aliens.iterator(); iter.hasNext();) {
//		Rectangle alien = iter.next();
//
//	if(colicao(alien.x, alien.y, alien.height, alien.width, nave.getTiroX(), nave.getTiroY(), nave.getLazerVermelho().getHeight() , nave.getImgLazerVermelho().getWidth())) {
//		nave.setAtaque(false);
//		pontos += 100;
//		iter.remove();
//	}else if(colicao(alien.x, alien.y, alien.height, alien.width, nave.getPostX(), nave.getPostY(), nave.getImgNave().getHeight() , nave.getImgNave().getWidth())) {
//		nave.perderEscudo();
//		iter.remove();
//	}
//}
//
//}
//	public boolean colicao(float x1, float y1, float h1, float w1, float x2, float y2, float h2, float w2) {
//	if(x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
//		return true;
//	}
//		return false;
//	}
//	
//	public int getPontos() {
//		return this.pontos;
//	}
//
//	public void setPontos(int pontos) {
//		this.pontos = pontos;
//	}
//	
//	
//	public Array<Rectangle> getAlien() {
//		return aliens;
//	}
	
	
	
}
