package kaardid;

public class Mang implements ManguLiides{
    
  int[] kaardid = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,10};
  public char osaleja='X'; 
  int i;
  int kaart = kaardid[i];
  String valik1 = "";
  String valik2 = "";
  int kaike = 0;
  int summa1 = 0;
  int summa2 = 0;
  int seisund;
	
  public void tyhjenda() {
		osaleja='X'; 
		kaardid= new int[]{2,3,4,5,6,7,8,9,10,10,10,10,10};
		summa1=0;
		summa2=0;
		   
}
public int summainfo1(){
	return summa1;
}

public int summainfo2(){
	return summa2;
}

	public int valiKaart() {
    int i = (int)(Math.random()*kaardid.length);
    return kaardid[i];
}
	public int valiKaart2() {
	    int i = (int)(Math.random()*kaardid.length/2);
	    return kaardid[i];
	}
	    
	public void kaik() {
		if(osaleja =='X'){
			summa1=summa1+valiKaart();
			osaleja='0';
							
		}
		else if(osaleja =='0'){
			summa2=summa2+valiKaart2();
			osaleja='X';	}
		}	

	
/*public int summa() {
		
	while(valik1=="j"){
			if(osaleja == '0' && valik1=="j") {
				summa1=summa1+kaart;
				osaleja='X';
			}else if (osaleja == 'X'&& valik2 == "j"){
				summa2=summa2+kaart;
			}
			
	}*/
			
public int tulemus() {
				
		if(summainfo1()>summainfo2() && summa1<22) {
			return 1;
		} 
		if(summa1<summa2 && valik1=="e" && valik2=="e" && summa2<22) {
			return 2;
		}
		if(summa1==summa2 && valik1=="e" && valik2=="e" && summa1<=21 && summa2<=21) {
			return 3;
		}
		else
		{
			return 0;
		
		}
}

}
