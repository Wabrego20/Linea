/*WILLIAM ALEXANDER ABREGO VEGA 
 * * 8-805-929*/
package poo;

public class PruebaPunto {
	public static void main(String[] args) {
		Punto punto1Linea1 = new Punto(5,2);
		Punto punto2Linea1 = new Punto(3,2);
		Punto punto1Linea2 = new Punto(1,4);
		Punto punto2Linea2 = new Punto(3,4);
		Linea linea = new Linea(punto1Linea1, punto2Linea1, punto1Linea2, punto2Linea2);

		System.out.print("Linea 1: P1 = ("+punto1Linea1.x+", "+punto1Linea1.y+")");
		System.out.println("; P2 = ("+punto2Linea1.x+", "+punto2Linea1.y+")");
		
		System.out.print("Linea 2: P1 = ("+punto1Linea2.x+", "+punto1Linea2.y+")");
		System.out.println("; P2 = ("+punto2Linea2.x+", "+punto2Linea2.y+")\n");
		
		if(linea.existeLinea1()) {
		System.out.println("Pendiente de Linea 1:");
		System.out.println(String.format("m1 = %.2f",linea.damePendienteLinea1()));
		
		System.out.println("Interseccion de Linea 1 en el eje Y:");
		System.out.println(String.format("b1 = %.2f",linea.dameIntersecciónLinea1()));
		}
		else {
			System.out.println("Pendiente de Linea 1 No Existe");
		}
		if(linea.existeLinea2()) {
		System.out.println("\nPendiente de Linea 2:");
		System.out.println(String.format("m2 = %.2f",linea.damePendienteLinea2()));
		
		System.out.println("Interseccion de Linea 2 en el eje Y:");
		System.out.println(String.format("b2 = %.2f",linea.dameIntersecciónLinea2()));
		}
		else {
			System.out.println("\nPendiente de Linea 2 No Existe");
		}
		if(linea.damePendienteLinea1()-linea.damePendienteLinea2()!=0) {
			System.out.println("\nEl punto de intersección entre las dos rectas es: ");
			System.out.print(String.format("P = (%.2f , ", linea.damePX()));
			System.out.println(String.format("%.2f)", linea.damePY()));
		}
		else {
			System.out.println("\nNo hay punto de intersección entre las dos rectas");
		}
		System.out.println(String.format("\nLa Distancia entre las dos rectas es:\nd = %.2f",linea.dameDistRectas()));
		System.out.println("\nFILIPENSES 4:13");
		System.out.println("TODO LO PUEDO EN CRISTO QUE ME FORTALECE");
	}
}
		