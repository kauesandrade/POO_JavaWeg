package com.mygdx.game;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Colisao {

	private Nave nave;
	private Meteoro meteoro;
	
	public Colisao(Nave nave) {
		super();
		this.nave = nave;
	};

	public Colisao() {
		super();
	}
	
	public boolean colisaoRectagle(Rectangle r1, Rectangle r2) {
		if(colicao(r1.x, r1.y, r1.height, r1.width, r2.x, r2.y, r2.height, r2.width)) {
			return true;
		}
		return false;
	}
	
	public Boolean colisaoRectangleNave(Rectangle r) {
		if(colicao(r.x, r.y, r.height, r.width, nave.getPostX(), nave.getPostY(), nave.getImgNave().getHeight() , nave.getImgNave().getWidth())) {
			return true;
		}
		return false;
	}
	
	
	public boolean colicao(float x1, float y1, float h1, float w1, float x2, float y2, float h2, float w2) {
		if(x1 + w1 > x2 && x1 < x2 + w2 && y1 + h1 > y2 && y1 < y2 + h2) {
			return true;
		}
		return false;
	}
}
