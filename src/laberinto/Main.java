package laberinto;



public class Main {
	
	public static void main(String[] args) {
        Estado inicio, meta;
        Laberinto lab_inicial, lab_fin;
        Celda[][] c1,c2;
        Busqueda b;
        
        
        c1 = new Celda[7][5];
       
        c1[0][0] = new Celda(0,0,"P");
        c1[0][1] = new Celda(0,1,"P");
        c1[0][2] = new Celda(0,2,"P");
        c1[0][3] = new Celda(0,3,"P");
        c1[0][4] = new Celda(0,4,"P");
        
        c1[1][0] = new Celda(1,0,"J");
        c1[1][1] = new Celda(1,1,"C");
        c1[1][2] = new Celda(1,2,"P");
        c1[1][3] = new Celda(1,3,"C");
        c1[1][4] = new Celda(1,4,"C");
        
        c1[2][0] = new Celda(2,0,"P");
        c1[2][1] = new Celda(2,1,"C");
        c1[2][2] = new Celda(2,2,"P");
        c1[2][3] = new Celda(2,3,"C");
        c1[2][4] = new Celda(2,4,"P");
        
        c1[3][0] = new Celda(3,0,"P");
        c1[3][1] = new Celda(3,1,"C");
        c1[3][2] = new Celda(3,2,"P");
        c1[3][3] = new Celda(3,3,"C");
        c1[3][4] = new Celda(3,4,"P");
        
        c1[4][0] = new Celda(4,0,"P");
        c1[4][1] = new Celda(4,1,"C");
        c1[4][2] = new Celda(4,2,"P");
        c1[4][3] = new Celda(4,3,"C");
        c1[4][4] = new Celda(4,4,"P");
        
        c1[5][0] = new Celda(5,0,"P");
        c1[5][1] = new Celda(5,1,"C");
        c1[5][2] = new Celda(5,2,"C");
        c1[5][3] = new Celda(5,3,"C");
        c1[5][4] = new Celda(5,4,"P");
        
        c1[6][0] = new Celda(6,0,"P");
        c1[6][1] = new Celda(6,1,"P");
        c1[6][2] = new Celda(6,2,"P");
        c1[6][3] = new Celda(6,3,"P");
        c1[6][4] = new Celda(6,4,"P");
        
        
        c2 = new Celda[7][5];
        
        c1[0][0] = new Celda(0,0,"P");
        c1[0][1] = new Celda(0,1,"P");
        c1[0][2] = new Celda(0,2,"P");
        c1[0][3] = new Celda(0,3,"P");
        c1[0][4] = new Celda(0,4,"P");
        
        c1[1][0] = new Celda(1,0,"C");
        c1[1][1] = new Celda(1,1,"C");
        c1[1][2] = new Celda(1,2,"P");
        c1[1][3] = new Celda(1,3,"C");
        c1[1][4] = new Celda(1,4,"J");
        
        c1[2][0] = new Celda(2,0,"P");
        c1[2][1] = new Celda(2,1,"C");
        c1[2][2] = new Celda(2,2,"P");
        c1[2][3] = new Celda(2,3,"C");
        c1[2][4] = new Celda(2,4,"P");
        
        c1[3][0] = new Celda(3,0,"P");
        c1[3][1] = new Celda(3,1,"C");
        c1[3][2] = new Celda(3,2,"P");
        c1[3][3] = new Celda(3,3,"C");
        c1[3][4] = new Celda(3,4,"P");
        
        c1[4][0] = new Celda(4,0,"P");
        c1[4][1] = new Celda(4,1,"C");
        c1[4][2] = new Celda(4,2,"P");
        c1[4][3] = new Celda(4,3,"C");
        c1[4][4] = new Celda(4,4,"P");
        
        c1[5][0] = new Celda(5,0,"P");
        c1[5][1] = new Celda(5,1,"C");
        c1[5][2] = new Celda(5,2,"C");
        c1[5][3] = new Celda(5,3,"C");
        c1[5][4] = new Celda(5,4,"P");
        
        c1[6][0] = new Celda(6,0,"P");
        c1[6][1] = new Celda(6,1,"P");
        c1[6][2] = new Celda(6,2,"P");
        c1[6][3] = new Celda(6,3,"P");
        c1[6][4] = new Celda(6,4,"P");
        
        
        
        
        lab_inicial = new Laberinto(c1);
        lab_fin = new Laberinto(c2);
        
        
        
      
        inicio = new Estado(lab_inicial, null, null);
        meta = new Estado(lab_fin, null, null);
        
        b = new Busqueda(inicio, meta);
        
        System.out.println(b.resultado());
    }    
	
}
