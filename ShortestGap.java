import java.util.ArrayList;
import java.util.Collections;

public class ShortestGap { 
  
  public static int shortestFinder(String doc[],String first, String second){
  
    ArrayList<Integer> xList = new ArrayList<Integer>();
    
    for(int i=0; i<doc.length;i++){
    	if(doc[i]==first){
        	for(int j=i+1; j>i && j<doc.length;j++){
            	if(doc[j]==second){
                	xList.add(j-i-1);
                }
            }
        }
      	if(doc[i]==second){
        	for(int k=i+1; k>i && k<doc.length;k++){
            	if(doc[k]==first){
                	xList.add(k-i-1);
                }
            }
        }
    }
    
    Collections.sort(xList);
    return xList.get(0);
  
  }
  
  public static void main(String[] args) {

    String[] input_array= {"ab","bc","cd","de","ef","ab","def","ghi"};

    String fromString = "ab";
    String toString = "de";
    System.out.println(shortestFinder(input_array, toString, fromString)); 
  } 
  
}
