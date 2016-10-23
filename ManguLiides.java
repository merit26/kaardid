package kaardid;

public interface ManguLiides {
  public void tyhjenda(); //peaks tekitama algseisu
 
  /*
   * Mängijad on 0 ja X
   * Kui summa on ületatud, peab tulema kaotus (sellele, 
   * kes esimesena summa ületab ja siis teisele võit)
   * Järgnev valija peab erinema eelmisest, kui eelmine ei ole avaldanud 
   * soovi lõpetada või kaotanud

   * @ return seisund
   * 	0 mäng jätkub
   *    1- 0 võit
   *    2 X võit
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