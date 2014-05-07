package laberinto;

import java.util.ArrayList;

public class Busqueda {
	private ArrayList<Estado> abiertos;
	private ArrayList<Estado> cerrados;
	private Estado actual;
	private Estado meta;
	
	
	
	public Busqueda(Estado actual, Estado meta) {
		
		this.abiertos = new ArrayList<>();
		this.cerrados = new ArrayList<>();
		this.actual = actual;
		this.meta = meta;
	}
	
	
	public String resultado(){
		StringBuilder str;
        ArrayList<String> resultado = buscar();
        int tam;
        
        if(resultado == null) return null;
       
        str = new StringBuilder();
        tam = resultado.size();
        
      
        for(int contador = 0; contador < tam; contador++) {
            str.append("Paso (").append(contador + 1).append(") ").
                append(resultado.get(contador)).append("\n");
        }
        
        return str.toString();
    }
		
		
	
	
	private ArrayList<String> buscar(){
		boolean win = false;
		ArrayList<String> resultado;
		
		abiertos.add(actual);
		
		while( !win && !abiertos.isEmpty() ){
			actual = abiertos.get(0);
		
			
			
			if( !cerrados.contains(actual) ){
				
				cerrados.add(actual);
				
				expandir(actual);
				
				if(actual.equals(meta)){ win = true; }
				
			}
			
			System.out.println("itero");
			abiertos.remove(0);
			System.out.println("elimino");
		}
		
		resultado = new ArrayList<>();
		while ( actual.getAntecesor() != null ){
			resultado.add(0,actual.toString());
			actual = actual.getAntecesor();
		}
		
		
		return resultado;
		
		
	}

	private void expandir(Estado actual){
		expandirArriba(actual);
		expandirAbajo(actual);
		expandirDerecha(actual);
		expandirIzquerda(actual);
	}
	
	
	
	private void expandirArriba(Estado actual) {
		Estado ex1;
		String mov1;
		int x,y,nx;
		Celda jugador;
		Laberinto l;
		//se obtiene laberinto
		l = actual.getLab();
		// posicion  del jugador
		jugador = l.getJugador();
		x = jugador.getX();
		y = jugador.getY();
		
			//se sale del tablero ?? 
			if( x - 1 >= 0 ){
			//pregunto por las pocisiones posibles si es distinto  de parede y no esta recorridas
				if( l.getCeldas()[x-1][y].getTipo() != "P" && l.getCeldas()[x-1][y].noRec()){
					 nx= x-1;
					 mov1 = " moverse a la pocicion [" + nx + "] ["+ y +"]" ;
			 
					 // se marca como recorrida y se mueve el jugador 
					 //l.getCeldas()[x][y].setNo_rec(false);
					 l.getCeldas()[x][y].setTipo("C");
					 l.getCeldas()[x-1][y].setTipo("J");
		
					 ex1 = new Estado(l, actual, mov1);
					 abiertos.add(ex1);	
				}
			}
	}
	
	
	private void expandirAbajo(Estado actual) {
		Estado ex1;
		String mov1;
		int x,y,nx;
		Celda jugador;
		Laberinto l;
		//se obtiene laberinto
		l = actual.getLab();
		// posicion  del jugador
		jugador = l.getJugador();
		x = jugador.getX();
		y = jugador.getY();
			//se sale del tablero ?? 
			if( x + 1 > 7  ){
			//pregunto por las pocisiones posibles si es distinto  de parede y no esta recorridas
				if( l.getCeldas()[x+1][y].getTipo() != "P" && l.getCeldas()[x+1][y].noRec()){
					 nx= x+1;
					 mov1 = " moverse a la pocicion [" + nx + "] ["+ y +"]" ;
			 
					 // se marca como recorrida y se mueve el jugador 
					 //l.getCeldas()[x][y].setNo_rec(false);
					 l.getCeldas()[x][y].setTipo("C");
					 l.getCeldas()[x+1][y].setTipo("J");
		
					 ex1 = new Estado(l, actual, mov1);
					 abiertos.add(ex1);	
				}
			}
	}
	
	
	private void expandirDerecha(Estado actual) {
		Estado ex1;
		String mov1;
		int x,y,ny;
		Celda jugador;
		Laberinto l;
		//se obtiene laberinto
		l = actual.getLab();
		// posicion  del jugador
		jugador = l.getJugador();
		x = jugador.getX();
		y = jugador.getY();
		
			//se sale del tablero ?? 
			if( y + 1 > 5  ){
			//pregunto por las pocisiones posibles si es distinto  de parede y no esta recorridas
				if( l.getCeldas()[x][y+1].getTipo() != "P" && l.getCeldas()[x][y+1].noRec()){
					 ny= y+1;
					 mov1 = " moverse a la pocicion [" + x + "] ["+ ny +"]" ;
			 
					 // se marca como recorrida y se mueve el jugador 
					 //l.getCeldas()[x][y].setNo_rec(false);
					 l.getCeldas()[x][y].setTipo("C");
					 l.getCeldas()[x][y+1].setTipo("J");
		
					 ex1 = new Estado(l, actual, mov1);
					 abiertos.add(ex1);	
				}
			}
	}
	
	
	private void expandirIzquerda(Estado actual) {
		Estado ex1;
		String mov1;
		int x,y,ny;
		Celda jugador;
		Laberinto l;
		//se obtiene laberinto
		l = actual.getLab();
		// posicion  del jugador
		jugador = l.getJugador();
		
		y = jugador.getY();
		x = jugador.getX();
			//se sale del tablero ?? 
			if( y - 1 >= 0  ){
			//pregunto por las pocisiones posibles si es distinto  de parede y no esta recorridas
				if( l.getCeldas()[x][y-1].getTipo() != "P" && l.getCeldas()[x][y-1].noRec()){
					 ny= y-1;
					 mov1 = " moverse a la pocicion [" + x + "] ["+ ny +"]" ;
			 
					 // se marca como recorrida y se mueve el jugador 
					 //l.getCeldas()[x][y].setNo_rec(false);
					 l.getCeldas()[x][y].setTipo("C");
					 l.getCeldas()[x][y-1].setTipo("J");
		
					 ex1 = new Estado(l, actual, mov1);
					 abiertos.add(ex1);	
				}
			}
	}
	
	
	
	
	
}
