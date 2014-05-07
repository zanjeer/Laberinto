package laberinto;

public class Celda {
	private int x,y;
	private String tipo;
	private boolean no_rec;
	
	
	
	
	public Celda(int x, int y, String tipo) {
	
		this.x = x;
		this.y = y;
		this.tipo = tipo;
		this.no_rec = true;
	}


	



	public int getX() {
		return x;
	}






	public int getY() {
		return y;
	}






	public String getTipo() {
		return tipo;
	}



	public void setTipo(String t){
		this.tipo = t;
	}
	
	

	public void setNo_rec(boolean no_rec) {
		this.no_rec = no_rec;
	}




	public boolean noRec() {
		return no_rec;
	}
	
	
	
	
	
	
}
