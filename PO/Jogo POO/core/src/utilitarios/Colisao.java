package utilitarios;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import objetos.Alien;
import objetos.Meteoro;
import objetos.Nave;
import tiros.Tiro;

public class Colisao {

	private Nave nave;
	private Meteoro meteoro;
	private Array<Tiro> arrTiros = new Array<>();
	private Alien alien;
	
	public Colisao(Nave nave, Meteoro meteoro, Alien alien) {
		super();
		this.nave = nave;
		this.meteoro = meteoro;
		this.alien = alien;
		this.arrTiros = nave.getArrTiros();
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
			nave.perderEscudo();
			return true;
		}
		return false;
	}
	public Boolean colisaoNavePoweup(Rectangle r) {
		if(colicao(r.x, r.y, r.height, r.width, nave.getPostX(), nave.getPostY(), nave.getImgNave().getHeight() , nave.getImgNave().getWidth())) {
			return true;
		}
		return false;
	}
	public Boolean colisaoTiro(Rectangle r) {
		for(Tiro t : arrTiros) {
			if(colicao(r.x, r.y, r.height, r.width, t.getTiroX(), t.getTiroY(), t.getImgTiro().getHeight() , t.getImgTiro().getWidth())) {
				t.setRemover(true);
				nave.setArrTiros(arrTiros);
				return true;
			}
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
