import java.util.Scanner;


public class proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print("\n");
			System.out.print("************Bienvenidos a la Sopa de Letras************");
			System.out.print("\n                                         lvl 1 ");
			System.out.print("\n                              Vidas [♥] ");
			char sopa[][]=new char[6][6];
			Scanner lol=new Scanner(System.in);
			sopa[0][0]='m';
			sopa[1][0]='a';
			sopa[2][0]='n';
			sopa[3][0]='g';
			sopa[4][0]='o';
			sopa[5][0]='s';
			System.out.print("\n    ["+sopa[0][0]+"]  ");
			System.out.print("  ["+sopa[1][0]+"]  ");
			System.out.print("  ["+sopa[2][0]+"]  ");
			System.out.print("  ["+sopa[3][0]+"]  ");
			System.out.print("  ["+sopa[4][0]+"]  ");
			System.out.print("  ["+sopa[5][0]+"]  ");
			sopa[0][0]='k';
			sopa[1][1]='ñ';
			sopa[2][2]='o';
			sopa[3][3]='y';
			sopa[4][4]='w';
			sopa[5][5]='u';
			System.out.print("\n    ["+sopa[0][0]+"]  ");
			System.out.print("  ["+sopa[1][1]+"]  ");
			System.out.print("  ["+sopa[2][2]+"]  ");
			System.out.print("  ["+sopa[3][3]+"]  ");
			System.out.print("  ["+sopa[4][4]+"]  ");
			System.out.print("  ["+sopa[5][5]+"]  ");
			sopa[0][0]='a';
			sopa[1][1]='m';
			sopa[2][2]='o';
			sopa[3][3]='r';
			sopa[4][4]='e';
			sopa[5][5]='s';
			System.out.print("\n    ["+sopa[0][0]+"]  ");
			System.out.print("  ["+sopa[1][1]+"]  ");
			System.out.print("  ["+sopa[2][2]+"]  ");
			System.out.print("  ["+sopa[3][3]+"]  ");
			System.out.print("  ["+sopa[4][4]+"]  ");
			System.out.print("  ["+sopa[5][5]+"]  ");
			sopa[0][0]='s';
			sopa[1][1]='y';
			sopa[2][2]='p';
			sopa[3][3]='q';
			sopa[4][4]='e';
			sopa[5][5]='o';
			System.out.print("\n    ["+sopa[0][0]+"]  ");
			System.out.print("  ["+sopa[1][1]+"]  ");
			System.out.print("  ["+sopa[2][2]+"]  ");
			System.out.print("  ["+sopa[3][3]+"]  ");
			System.out.print("  ["+sopa[4][4]+"]  ");
			System.out.print("  ["+sopa[5][5]+"]  ");
			sopa[0][0]='p';
			sopa[1][1]='j';
			sopa[2][2]='r';
			sopa[3][3]='w';
			sopa[4][4]='x';
			sopa[5][5]='z';
			System.out.print("\n    ["+sopa[0][0]+"]  ");
			System.out.print("  ["+sopa[1][1]+"]  ");
			System.out.print("  ["+sopa[2][2]+"]  ");
			System.out.print("  ["+sopa[3][3]+"]  ");
			System.out.print("  ["+sopa[4][4]+"]  ");
			System.out.print("  ["+sopa[5][5]+"]  ");
			System.out.print("\n-------------------------------------------");
			System.out.println("\n        Ingrese las Palabras que encuentre          ");
			
			String resp1="mangos";
			String resp2="amores";
			
			for (int i=0;i<2;i ++){
				String respuesta;
		        Scanner scan = new Scanner(System.in);
		        int palabrascorrectas = 2;
		        respuesta = scan.next();
	            respuesta=respuesta.toUpperCase();
	            if (respuesta.equals("mangos") ||  respuesta.equals("amores"));
	            palabrascorrectas++;
	            System.out.println("     felicidades     ");
				
            }
            
			System.out.print("\n************Felicidades Avanzas al Level 2************ ");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");

			System.out.print("\n************Bienvenidos a la Sopa de Letras************");
			System.out.print("\n lvl 2 ");
			System.out.print("\n Vidas [♥] [♥]");

			sopa[0][0]='a';
			sopa[1][0]='n';
			sopa[2][0]='i';
			sopa[3][0]='l';
			sopa[4][0]='l';
			sopa[5][0]='o';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][0]+"] ");
			System.out.print(" ["+sopa[2][0]+"] ");
			System.out.print(" ["+sopa[3][0]+"] ");
			System.out.print(" ["+sopa[4][0]+"] ");
			System.out.print(" ["+sopa[5][0]+"] ");
			sopa[4][0]='q';
			sopa[0][0]='p';
			sopa[1][1]='r';
			sopa[2][2]='a';
			sopa[3][3]='h';
			sopa[4][4]='a';
			sopa[5][5]='a';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			sopa[0][0]='o';
			sopa[1][1]='f';
			sopa[2][2]='p';
			sopa[3][3]='f';
			sopa[4][4]='p';
			sopa[5][5]='p';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			sopa[0][0]='m';
			sopa[1][1]='a';
			sopa[2][2]='p';
			sopa[3][3]='i';
			sopa[4][4]='i';
			sopa[5][5]='t';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			sopa[0][0]='c';
			sopa[1][1]='a';
			sopa[2][2]='d';
			sopa[3][3]='e';
			sopa[4][4]='n';
			sopa[5][5]='a';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			System.out.print("\n-------------------------------------------");
			System.out.println("\n Ingrese las Palabras que encuentre ");
			String resp01 = "anillo";
			String resp02 = "cadena";
			
			for (int i=0;i<3;i ++){
				String respuesta;
		        Scanner scan = new Scanner(System.in);
		        int palabrascorrectas = 2;
		        respuesta = scan.next();
	            respuesta=respuesta.toUpperCase();
	            if (respuesta.equals("mangos") ||  respuesta.equals("amores"));
	            palabrascorrectas++;
	            System.out.println("     felicidades     ");
			
			if (respuesta.equals("mangos") || respuesta.equals("amores") || respuesta.equals("anillo")|| respuesta.equals("cadena"))
					
			System.out.println(" Felicidades ");
			
	
			System.out.print("\n************Felicidades Avanzas al Level 3*********** ");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("************Bienvenidos a la Sopa de Letras************");
			System.out.print("\n lvl 3 ");
			System.out.print("\n Vidas [♥] [♥] [♥]");
			sopa[0][0]='a';
			sopa[1][0]='r';
			sopa[2][0]='i';
			sopa[3][0]='t';
			sopa[4][0]='o';
			sopa[5][0]='s';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][0]+"] ");
			System.out.print(" ["+sopa[2][0]+"] ");
			System.out.print(" ["+sopa[3][0]+"] ");
			System.out.print(" ["+sopa[4][0]+"] ");
			System.out.print(" ["+sopa[5][0]+"] ");
			sopa[0][0]='q';
			sopa[1][1]='r';
			sopa[2][2]='p';
			sopa[3][3]='h';
			sopa[4][4]='a';
			sopa[5][5]='a';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			sopa[0][0]='o';
			sopa[1][1]='f';
			sopa[2][2]='p';
			sopa[3][3]='f';
			sopa[4][4]='m';
			sopa[5][5]='m';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			sopa[0][0]='s';
			sopa[1][1]='a';
			sopa[2][2]='p';
			sopa[3][3]='i';
			sopa[4][4]='o';
			sopa[5][5]='o';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			sopa[0][0]='o';
			sopa[1][1]='a';
			sopa[2][2]='p';
			sopa[3][3]='i';
			sopa[4][4]='z';
			sopa[5][5]='z';
			System.out.print("\n ["+sopa[0][0]+"] ");
			System.out.print(" ["+sopa[1][1]+"] ");
			System.out.print(" ["+sopa[2][2]+"] ");
			System.out.print(" ["+sopa[3][3]+"] ");
			System.out.print(" ["+sopa[4][4]+"] ");
			System.out.print(" ["+sopa[5][5]+"] ");
			System.out.print("\n-------------------------------------------");
			System.out.println("\n Ingrese las Palabras que encuentres ");
			String resp20 = "mangos";
			String resp21 = "amores";
			String resp22 = "anillo";
			String resp23 = "cadena";
			String resp24 = "aritos";
			
			for (int i1=0;i1<4;i1 ++){
		        Scanner scannner = new Scanner(System.in);
		        int palabrascorrecta= 1;
		        respuesta = scan.next();
	            respuesta=respuesta.toUpperCase();	
			 		
			if (respuesta.equals("mangos") || respuesta.equals("amores") || respuesta.equals("anillo")|| respuesta.equals("cadena")|| respuesta.equals("aritos"))
			System.out.println(" Felicidades ");
			 palabrascorrecta++;
			
			System.out.print("\n************Felicidades Ganaste un Premio************ ");
			System.out.print("\n                         "); 
			}
		            
		}					
			
			
	}  
		
}      
			
			
	


	






			

