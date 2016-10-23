package kaardid;
import java.io.*;
public class ManguKlient {
static ManguLiides m1=new Mang();
//static int seisund=0;
		    static void kuvaMang(){/*siia on midagi muud vaja edasi*/
		    /*	String t="";
		    	for(int rida=1; rida<=3; rida++){
		    		for(int veerg=1; veerg<=3; veerg++){
		    			t+=laud.symbol(rida, veerg);
		    		}
		    		t+="\n";*/
		    	
		    	System.out.println("Hakkame mängima");
		    
		    }
		    static String[] kysiKaik(){
		      while(true){
		    	try{
		    		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
		    	//	System.out.println(kellekord+" kord");
		    		System.out.println(m1.summainfo1());
		    		System.out.println(m1.summainfo2());
		    		System.out.println(m1.tulemus());
		    		System.out.println("Soovid kaarti?");
		    		String valik=(sisse.readLine());
		    	if(valik.equals ("j")&&m1.tulemus()==0){
		    	   		//}
		    	m1.kaik();	
		    	m1.tulemus();
		    	if(m1.tulemus()==1){System.out.println("Nulli võit");}
				if(m1.tulemus()==2){System.out.println("Risti võit");}
				if(m1.tulemus()==3){System.out.println("Viik");}
		    	
		    	
		    	}		    		
		    	}catch (Exception ex){ 
		    		//ex.printStackTrace();
		    		
		    		System.out.println(ex.getMessage());
		    	}
		      }
		    }
			public static void main(String[] args) {
				kuvaMang();
				kysiKaik();	 
												
			}
		}