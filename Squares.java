import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Squares {

	public static void main(String[] args){
		
		        Scanner in = new Scanner(System.in);
		        int w = in.nextInt();
		        int h = in.nextInt();
		        int circleX = in.nextInt();
		        int circleY = in.nextInt();
		        int r = in.nextInt();
		  /*      int x1 = in.nextInt();
		        int y1 = in.nextInt();
		        int x3 = in.nextInt();
		        int y3 = in.nextInt();*/
		       
		        char canvas[][] = new char[h][w];
		     
		        for(int i=0;i<h;i++)
		        	for(int j=0;j<w;j++)
		               canvas[i][j]='.';
		        
		        
		        
		        
		        for(int i=0;i<h;i++){
		        	
		        	for(int j=0;j<w;j++){
		        		
		        		if( dist(i,j,circleX,circleY) < r ){
		        			
		        			
		        			canvas[i][j]='*';
		        		}
		        		
		        		
		        		
		        	}
		        	
		        	
		        	
		        	
		        }
		         display(canvas,h,w);    
                 
                  
		        
		        
		    }
	public static void display(char canvas[][],int h,int w){
		
		
		 for(int i=0;i<h;i++){
	        	
	        	for(int j=0;j<w;j++)
	        		System.out.print(canvas[i][j]);
	        	System.out.println();
	        	
	        }
           
	}
	
	public static int dist(int a,int b,int c,int d){
		
		
		
		
		return (int)Math.sqrt(    (a-c)*(a-c) + (b-d)*(b-d)    );
		
	}
	
		}

		
		
	
