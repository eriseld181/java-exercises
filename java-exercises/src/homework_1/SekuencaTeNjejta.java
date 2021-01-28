package homework_1;
import java.util.*;
public class SekuencaTeNjejta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fjala1 = "afaasaas";
		String fjala2 = "afaiasa";
		ArrayList<Character> array1 = new ArrayList<Character>();
int count=0;
		char[] ch = new char[fjala1.length()];
		for (int i = 0; i < fjala1.length(); i++) { 
            ch[i] = fjala1.charAt(i); 
        } 
//		System.out.println(ch);
		//2
		char[] ch2 = new char[fjala2.length()];
		for (int i = 0; i < fjala2.length(); i++) { 
            ch2[i] = fjala2.charAt(i); 
        } 
//		System.out.println(ch2);
		int max =0;
		for(int i=0; i<ch.length-1;i++) {
			
			for(int j=0; j<ch2.length-1;j++) {
				if(ch[i]==ch2[j]) {
					count = 1;
					for(int x=1; x+i<ch.length && x+j<ch2.length;x++) {
						
						if(ch[i+x]==ch2[j+x]) {
							count++;
							if(max <= count) {
								max = count;
							}
//							System.out.print(max);
						}
						else {
							break;
						}
					}
					
				}
						
				}
			
			}
		System.out.println(max);
		}
  
		
		
		
  
       
      
	}


