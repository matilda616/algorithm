package test;
import java.awt.List;
import java.util.Scanner;

//백준 알고리즘 문제풀이
//8958 OX퀴즈
public class Main {

	public static void main(String[] args){
	
		
		  Scanner sc = new Scanner(System.in);
	      int count = sc.nextInt();
	      String[] list = new String[count];
	      
	      for(int i=0;i<count;i++){
	    	  list[i]=sc.next();
	      }
	     
	      int j=0;
	      while(j!=count){
	    	  int sum = 0;
	    	  int total=0;
	    	  for(int i=0;i<list[j].length();i++){
	    		  if(i==list[j].length()-1){
	    			  String temp = list[j].substring(i);
	    			  if(temp.equals("O")){
		    			  sum+=1;
		    			  total+=sum;
		    		  }else if(temp.equals("X"))
		    			  sum=0;
	    		  }else{
	    			  String temp = list[j].substring(i, i+1);
		    		  if(temp.equals("O")){
		    			  sum+=1;
		    			  total+=sum;
		    		  }else if(temp.equals("X"))
		    			  sum=0;
	    		  }
	    		 
	    	  }
	    	 System.out.println(total);
		     j+=1;
	      }
	      
	}
}
