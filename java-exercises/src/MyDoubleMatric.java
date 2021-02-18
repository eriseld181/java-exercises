import java.util.Scanner;
public class MyDoubleMatric {
private static Scanner input;
public static void main(String[] args) {
input = new Scanner(System.in);
int n = 3, m = 3;
int [][] matrix = new int[n][m];
System.out.print("Vendosni elementet e matrices: ");
for(int i=0; i<n; i++){
for(int j=0; j<m; j++){
matrix[i][j] = input.nextInt();
}
}
printmatrix(matrix); // therasim funksionin per te afishuar matricen
String vekA = "";
String vekB = "";
for(int i=0; i<n; i++){
for(int j=0; j<m; j++){
if(matrix[i][j]<0){
vekA += Math.pow(matrix[i][j], 2);
}else{
vekB += Math.sqrt(matrix[i][j]);
}
}
}
System.out.println("vekA: "+vekA);
System.out.print("vekB: "+vekB);
}
public static void printmatrix(int a[][]){ //funksioni qe do te afishoj vlerat e matrix
for(int i=0; i<a.length; i++){

for(int j=0; j<a[i].length; j++){
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}
}