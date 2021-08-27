

package camioneta.java;

/public  class  Coche {

  // atributo de clase
  privado  estático  int kilometrajeTotal =  0 ;
  
  // método de clase
  public  static  int  getKilometrajeTotal () {
    volver  Coche . kilometrajeTotal;
  }
  
  Private  String marca;
   modelo de cadena privada ;
   kilometraje int privado ;

  public  Coche ( String  ma , String  mo ) {
    esto . marca = ma;
    esto . modelo = mo;
    esto . kilometraje =  0 ;
  }
  
  public  int  getKilometraje () {
    devuelve  esto . kilometraje;
  }

  / **
   * Recorre una determinada distancia.
   * 
   * @param km distancia a recorrer en kilómetros
   * /  
   registro de vacío  público ( int km ) { 
    esto . kilometraje + = km;
    Coche . kilometrajeTotal + = km;
  }
}
 
