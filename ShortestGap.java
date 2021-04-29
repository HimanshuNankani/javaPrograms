import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShortestGap { 
  
  public static int shortestFinder(String doc[],String first, String second){
  
    ArrayList<Integer> xList = new ArrayList<Integer>();

    for(int i=0; i<doc.length;i++){
    	if(doc[i].equals(first)){
        	for(int j=i+1; j>i && j<doc.length;j++){
            	if(doc[j].equals(second)){
                	xList.add(j-i-1);
                }
            }
        }
      	if(doc[i].equals(second)){
        	for(int k=i+1; k>i && k<doc.length;k++){
            	if(doc[k].equals(first)){
                	xList.add(k-i-1);
                }
            }
        }
    }

    Collections.sort(xList);
    return xList.size()>0 ? xList.get(0) : -1;
  
  }
  
  public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    
    System.out.print("Enter no.of elements : ");
    int n = myobj.nextInt();
    myobj.nextLine();
    
    String[] input_array= new String[n];
    
    System.out.println("Enter the elements : ");
    for(int x=0; x<n; x++){
        input_array[x] = myobj.nextLine();
    }
    
    System.out.print("FromString : ");
    String fromString = myobj.nextLine();
    
    System.out.print("ToString : ");
    String toString = myobj.nextLine();
    
    System.out.println(shortestFinder(input_array, fromString, toString)); 
  } 
  
}
