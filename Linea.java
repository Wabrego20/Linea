/*WILLIAM ALEXANDER ABREGO VEGA
 * 8-805-929*/

package poo;
import poo.Punto;
public class Linea {
	public Punto punto1Linea1; Punto punto2Linea1; Punto punto1Linea2; Punto punto2Linea2;
	public double pendienteLinea1, pendienteLinea2, interseccionLinea1, interseccionLinea2; 
	public double X, Y, distRectas;
	
	public Linea(Punto punto1Linea1, Punto punto2Linea1, Punto punto1Linea2, Punto punto2Linea2) {
		this.punto1Linea1=punto1Linea1;
		this.punto2Linea1=punto2Linea1;
		this.punto1Linea2=punto1Linea2;
		this.punto2Linea2=punto2Linea2;
	}
	public boolean existeLinea1() {
		if(punto2Linea1.dameX() - punto1Linea1.dameX() != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean existeLinea2() {
		if(punto2Linea2.dameX() - punto1Linea2.dameX() != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public double damePendienteLinea1() {
		if(existeLinea1()) {
			pendienteLinea1 = (punto2Linea1.dameY() - punto1Linea1.dameY()) / (punto2Linea1.dameX() - punto1Linea1.x);
		}
		return pendienteLinea1;
	}
		public double damePendienteLinea2() {
			if(existeLinea2()) {
				pendienteLinea2 = (punto2Linea2.dameY() - punto1Linea2.dameY()) / (punto2Linea2.dameX() - punto1Linea2.x);
			}
			return pendienteLinea2;
	}
	public double dameIntersecciónLinea1() {
		if (existeLinea1()) {
			interseccionLinea1 = punto2Linea1.dameY() - (damePendienteLinea1() * punto2Linea1.dameX());
		}
		return interseccionLinea1;
	}
	public double dameIntersecciónLinea2() {
		if (existeLinea2()) {
			interseccionLinea2 = punto2Linea2.dameY() - (damePendienteLinea2() * punto2Linea2.dameX());
		}
		return interseccionLinea2;
	}
	public double damePX() {
		 X= (dameIntersecciónLinea2() - dameIntersecciónLinea1()) /(damePendienteLinea1()-damePendienteLinea2());
		 if(punto2Linea1.dameX() - punto1Linea1.x==0) {
				X=punto1Linea1.x;
			}
		 if(punto2Linea2.dameX() - punto1Linea2.x==0) {
				X=punto1Linea2.x;
			}
		 return X;
	}
	public double damePY() {
		Y =(damePendienteLinea2()*damePX()) + dameIntersecciónLinea2();
		if(punto2Linea2.dameX() - punto1Linea2.x==0) {
			Y =(damePendienteLinea1()*damePX()) + dameIntersecciónLinea1();		}
		return Y;
	}
	public double dameDistRectas() {
		return distRectas= Math.abs((dameIntersecciónLinea1() - dameIntersecciónLinea2())/Math.sqrt((Math.pow(damePendienteLinea2(), 2)+Math.pow(dameIntersecciónLinea1(), 2))));
	}
}
	
