/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg2;

/**
 *
 * @author ddizoya
 */
public class Satelite {
    private double meridiano ;
    private double paralelo;
    private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}

public Satelite ( double m, double p , double d ) {

meridiano = m ;
paralelo = p ;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println ("O satelite atópase  no paralelo" + paralelo + ", meridiano " + meridiano + ", a unha distancia da terra" + distanciaTerra );     

}
}
