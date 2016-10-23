package kaardid;

public interface ManguLiides {
  public void tyhjenda(); //peaks tekitama algseisu
 
  /*
   * M�ngijad on 0 ja X
   * Kui summa on �letatud, peab tulema kaotus (sellele, 
   * kes esimesena summa �letab ja siis teisele v�it)
   * J�rgnev valija peab erinema eelmisest, kui eelmine ei ole avaldanud 
   * soovi l�petada v�i kaotanud

   * @ return seisund
   * 	0 m�ng j�tkub
   *    1- 0 v�it
   *    2 X v�it
   *    3 viik
   */
public void kaik();
public int summainfo1();
public int summainfo2();
public int tulemus();
//public int summa();
//public int tulemus();
public int valiKaart();
public int valiKaart2();

}