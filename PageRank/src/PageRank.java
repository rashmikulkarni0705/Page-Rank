import java.util.Arrays;
import java.util.Scanner;


public class PageRank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of rows: ");
        int Rows = input.nextInt();
        System.out.print(Rows);
	    System.out.print("Enter the number of columns: ");
	    int Cols = input.nextInt();
	    //boolean f=false;
	    //DecimalFormat.\  
	    Calc c1=new Calc();
	    double[][] M1 = new double[Rows][Cols];
	    double[][] v0 = new double[Rows][1];
	    double[][] v11 = new double[Rows][1];
        double[][] en1 = new double[Rows][1];
        
       // double[][] diff = new double[Rows][1];
        int count=0;
        
	    System.out.println("Enter the numbers in array: ");
	    for (int i = 0; i < M1.length; i++) 
	    {
	    	for (int j = 0; j < M1[i].length; j++)
	                M1[i][j] = input.nextFloat();
	    }
	    
	    double B=0.8;
        for (int i = 0; i < M1.length; i++) 
        {
	        	//System.out.print("\n");   	
	       	for (int j = 0; j < M1[i].length; j++)
	       	{
	                M1[i][j]=B*M1[i][j];
	               //	System.out.print(M[i][j]+ " ");
           	}
	    }
	        
        double c =1-B;
	        //System.out.println(c +"\n");
	    double a= 1.0/Rows;
	        //System.out.println(a +"\n");
	        
	    for (int i = 0; i<Rows; i++) 
	    {
	        	//System.out.print("\n");
	    	for (int j = 0; j <1 ; j++)
	      	{
	              		v0[i][j] = a;
	              		//System.out.print(v[i][j]+" ");
	              		en1[i][j]=c*v0[i][j];        
	      	}
	    }
	    System.out.println("v0 " + Arrays.deepToString(v0));
	    v11=c1.cal(M1,v0,en1);
	    for( ; ; )
	    {
	        	
	        	//v11=c1.cal(M1,v0,en1);
	        	count++;
	        	System.out.println("Iteration "+ count);
	        	//System.out.println("v " + Arrays.deepToString(v));
	        	
	        	if(c1.substract(v11,v0))
	        	{
	        		System.out.println("v1 "+ Arrays.deepToString(v11));
	        		break;
	        	}
	        	
	        	//v = Arrays.copyOf(v1, v1.length);
	        	else
   	        		{
   	        			v0=v11;
   	        			System.out.println("v1 " + Arrays.deepToString(v0));
   	        			v11=c1.cal(M1, v0, en1);
   	        		}	
   	       	}
	    }
	}




