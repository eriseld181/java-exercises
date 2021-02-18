package l4EnumsVectors;
import java.lang.reflect.Array;
import java.util.*;
public class WorkingWithVectors {

	public static void main(String[] args) {
	
		// DEKLARIMI
		int []vektorNumri1 = new int[5];
		int []vektorNumri2 = new int[5];
		String []listEmrash1 = new String[1000];
		String []listEmrash2 = new String[1000];
		
		//RUAJTJA E VLERES METODA 1
		vektorNumri1[0]  =1;
		vektorNumri1[1]  =2;
		vektorNumri1[2]  =3;
		vektorNumri1[3]  =4;
		vektorNumri1[4]  =5;
		//String
		listEmrash1[0]  ="a";
		listEmrash1[1]  ="b";
		listEmrash1[2]  ="c";
		listEmrash1[3]  ="d";
		listEmrash1[4]  ="e";
		
		//Inicializim array 
		int []vektorNumri3= {6, 7, 8, 9, 10};
		String []listEmrash3 = {"f", "g", "i", "j", "k"};
		
		//Veprime me Array
		
		//Printo me ciklin for:
		for(int i =0;i<vektorNumri1.length;i++) {
			System.out.print(vektorNumri1[i]);
		}
		System.out.println();
		//Printo nje array char:
		char[] qyteti = {'D', 'u', 'r', 'r', 'e', 's'}; 
		System.out.println(qyteti);
		//Printo shumen e nje array elementesh:
		int shuma = 0;
		for(int i =0;i<vektorNumri1.length;i++) {
			shuma +=vektorNumri1[i];
		}
		System.out.println("shuma: "+shuma);
	
		//inicializo vlerat e nje array me gjatesi fikse:
		Scanner in = new Scanner(System.in);
		int []vlera = new int[5];
		System.out.println("vendosni "+vlera.length+" vlerat e tabeles me numra te plote ");
		for(int i = 0; i<vlera.length;i++) {
			vlera[i] = in.nextInt();
			System.out.print(vlera[i] +" ,");
		}
		System.out.println();
		//inicializo vlerat e nje array me gjatesi te paracaktuar:
		System.out.println("vendos madhesine e array");
		
		int n = in.nextInt();
		int vleraArray1[] =new int [n];
		
		System.out.println("vendos te dhenat"+vleraArray1.length);
		for(int i=0; i<vleraArray1.length;i++) {
			if(vleraArray1[i]< vleraArray1.length) {
			vleraArray1[i]= in.nextInt();
			}
			
			System.out.print(vleraArray1[i]+" ,");
		}
	}

}
