package utilitarios;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import objetos.Nave;
import tiros.Tiro;

public class Colisao {

	private Nave nave;
	
	private Array<Tiro> arrTiros = new Array<>();
	
	public Colisao(Nave nave) {
		super();
		this.nave = nave;
		this.arrTiros = nave.getArrTiros();
	};
	
	public Nave getNave() {
		return nave;
	}



	public void setNave(Nave nave) {
		this.nave = nave;
	}

	public Colisao() {
		super();
	}
	
	public Boolean colisaoRectangleNave(Rectangle r) {
		if(colicao(r.x, r.y, r.height, r.width, nave.getPostX(), nave.getPostY(), nave.getImgNave().getHeight() , nave.getImgNave().getWidth())) {
			nave.perderEscudo();
			return true;
		}
		return false;
	}
	
	public Boolean colisaoTiro(Rectangle r) {
		for(Tiro t : arrTiros) {
			if(colicao(r.x, r.y, r.height, r.width, t.getTiroX(), t.getTiroY(), t.getImgTiro().getHeight() , t.getImgTiro().getWidth())) {
				if(t.getImgTiro().toString() != "tiroBomba.png") {
					t.setRemover(true);
				}
				nave.setArrTiros(arrTiros);
				return true;
			}
		}
		return false;
		
	}
	public Boolean colisaNavePowerUp(float powerUpX, float powerUpY, Texture img) {
			if(colicao(powerUpX, powerUpY, img.getHeight(), img.getWidth(), nave.getPostX(), nave.getPostY(), nave.getImgNave().getHeight() , nave.getImgNave().getWidth())) {
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
