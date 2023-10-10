//package com.mygdx.game;
//
//import com.badlogic.gdx.math.Rectangle;
//import com.badlogic.gdx.utils.Array;
//
//public class Colisao {
//	
//	private Array<Meteoro> ArrMeteoros = new Array<>();
//	
//	public void colisaoMeteoro() {
//		for(Rectangle m : ArrMeteoros) {
//			if(colicao(meteoro.x, meteoro.y, meteoro.height, meteoro.width, nave.getTiroX(), nave.getTiroY(), nave.getLazerVermelho().getHeight() , nave.getImgLazerVermelho().getWidth()))) {
//				
//			}
//		}
//	}
//
//	public boolean colicao(float x1, float y1, float h1, float w1, float x2, float y2, float h2, float w2) {
//		if(x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
//			return true;
//		}
//		return false;
//	}
//	
//}
