import java.util.*;
public class FindSink {

	static int n;
	static int[][] am;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of vertices");
		n = sc.nextInt();
		am = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			am[i][j] = sc.nextInt();
		
	
		
		int vertex = eliminate();
		
		if (vertex >= 0)
            System.out.println("Sink found at vertex "
                                     + (vertex + 1));
        else
            System.out.println("No Sink");
		
		
			
	}
	 public static boolean issink(int i)
	    {
	        for (int j = 0 ; j < n ; j++)
	        {
	            // if any element in the row i is 1, it means
	            // that there is an edge emanating from the
	            // vertex, which means it cannot be a sink
	            if (am[i][j] == 1)
	                return false;
	 
	            // if any element other than i in the column
	            // i is 0, it means that there is no edge from
	            // that vertex to the vertex we are testing
	            // and hence it cannot be a sink
	            if (am[j][i] == 0 && j != i)
	                return false;
	        }
	        //if none of the checks fails, return true
	        return true;
	    }
	 
	    // we will eliminate n-1 non sink vertices so that
	    // we have to check for only one vertex instead of
	    // all n vertices
	    public static int eliminate()
	    {
	        int i = 0, j = 0;
	        while (i < n && j < n)
	        {
	            // If the index is 1, increment the row we are
	            // checking by 1
	            // else increment the column
	            if (am[i][j] == 0 && i!=j)
	                j = j + 1;
	            else
	                i = i + 1;
	 
	        }
	 
	        // If i exceeds the number of vertices, it
	        // means that there is no valid vertex in
	        // the given vertices that can be a sink
	        if (j > n)
	            return -1;
	        else if (!issink(j))
	            return -1;
	        else return j;
	        
	    }
	}

