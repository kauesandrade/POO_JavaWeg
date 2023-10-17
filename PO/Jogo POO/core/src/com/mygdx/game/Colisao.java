package com.mygdx.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import tiros.Tiro;

public class Colisao {
	
	private Nave nave;
	private Meteoro meteoro;
	
	
	public Colisao(Nave nave, Meteoro meteoro) {
		super();
		this.nave = nave;
		this.meteoro = meteoro;
	};

	public Colisao() {
		super();
	}

	public void colisaoMeteoro() {
		for(Rectangle m : meteoro.getMeteoros()) {
			if(colicao(m.x, m.y, m.height, m.width, nave.getPostX(), nave.getPostY(), nave.getImgNave().getHeight() , nave.getImgNave().getWidth())) {
		System.out.println("A");
			}
		}
	}		

	
	
	public boolean colicao(float x1, float y1, float h1, float w1, float x2, float y2, float h2, float w2) {
		if(x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
			return true;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
//	public boolean colisao1(float x, float y, float h, float w) {
//		
//		if(x + w > nave.getPostX() && x < nave.getPostX() + nave.getImgNave().getHeight() && y + h > nave.getPostY() && y < nave.getPostY() + nave.getImgNave().getHeight()) {
//			return true;
//		}
//		
//		Array<Tiro> arrTiros = new Array<>();
//		arrTiros = nave.getArrTiros();
//		
//		for(Tiro tiro : arrTiros) {
//			if(x + w > tiro.getTiroX() && x < tiro.getTiroX() + tiro.getImgTiro().getHeight() && y + h > tiro.getTiroY() && y < tiro.getTiroY() + tiro.getImgTiro().getHeight()) {
//				tiro.setRemover(true);
//				nave.setArrTiros(arrTiros);
//				return true;
//			}
//		}
//		
//		return false;
//	}
	
}
