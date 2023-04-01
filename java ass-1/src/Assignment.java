
public class Assignment {
public static void main(String[]args) {
	int n=7;
	for(int i=0;i<=n-1;i++) 
	{
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 || j==n/2 || i-j==n/2 && i>=n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		
		for(int j=0;j<=n-1;j++)
		{
			if((i==j || i+j==n-1) && i<=3)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		
		for(int k=0;k<=n/2;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0||i==n-1||j==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=0 || i==n-1 && j!=n-1 || i==n/2 && j!=0 && j!=n-1 || j==0 && i!=0 && i<n/2 || j==n-1 && i>n/2 && i!=n-1)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		
		for(int k=0;k<=n/2;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(j==0||j==n-1||j==i && j<=n/2||i+j==n-1 && i<=n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" "); 
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 || i==n-1 || j==n-i-1)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0||i==n-1||j==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			
			if(j==0 || j==n-1||j==i)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0||j==0 || j==n-1 && i!=(n/2)-1 || i>=n/2 && j==n/2 || i==n/2 && j>=n/2 || i==n-1 && j<=n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		System.out.println();
	}
	for(int k=0;k<=n/2 -1;k++)
	{System.out.println();}
	
for(int i=0;i<=n-1;i++) 
	{
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=n-1 || j==0|| i==n/2 && j!=n-1 || ( i==1 || i==2) && j==n-1)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(j==0 || i==0 && j<n/2 ||( i==1 || i==2) && j==n/2 || i==n/2 && j<n/2 || i-j==n/2 && i>n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if((i==0||i==n-1)&& (j!=0 && j!=n-1) || (j==0||j==n-1)&& (i!=0 && i!=n-1) )
				
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if((j==0  || j==n-1) && i!=n-1 ||i==n-1 && j!=0 && j!=n-1)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(j==0||i==0&&j!=n-1||i==n-1&&j!=n-1||j==n-1&&i!=0&&i!=n-1)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int k=0;k<=n/2;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0||j==0 || j==n-1 && i!=(n/2)-1 || i>=n/2 && j==n/2 || i==n/2 && j>=n/2 || i==n-1 && j<=n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if((i==0|| i==n/2 + 1) && j!=0 && j<=n/2 || (j==0 || j==n/2 + 1)&& i!=0 && i<=n/2  || (i==j &&i>=n/2))
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0||j==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0||i==n-1||j==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.print(" ");
		
		for(int j=0;j<=n-1;j++)
		{
			
			if(j==0 || j==n-1||j==i)
			{ System.out.print("*");
			}
			else
			{System.out.print(" ");
			}
		}
		System.out.println();
}

		for(int k=0;k<=n/2 -1;k++)
		{System.out.println();}
		
     for(int i=0;i<=n-1;i++) 
	 {
    	  for(int j=0;j<=n-1;j++)
  		 {
  			if(i==0||j==n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		 }	
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(j==0||j==n-1||i==n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			
  			if(j==0 || j==n-1||j==i)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(j==0||i+j==n/2 && i<n/2||i-j==n/2 && i>n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  
    	  for(int k=0;k<=n/2;k++)
  		{
  			System.out.print(" ");
  		}
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(j==n-i-1 || i==j && j<=n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if((i==0||i==n-1)&& (j!=0 && j!=n-1) || (j==0||j==n-1)&& (i!=0 && i!=n-1) )
  				
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if((j==0  || j==n-1) && i!=n-1 ||i==n-1 && j!=0 && j!=n-1)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	 
    	  for(int k=0;k<=n/2;k++)
    		{
    			System.out.print(" ");
    		}
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(i==0||j==0 || j==n-1 && i!=(n/2)-1 || i>=n/2 && j==n/2 || i==n/2 && j>=n/2 || i==n-1 && j<=n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(j==0 || i==0 && j<n/2 ||( i==1 || i==2) && j==n/2 || i==n/2 && j<n/2 || i-j==n/2 && i>n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int k=0;k<=n/2;k++)
  		{
  			System.out.print(" ");
  		}
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(i==0 && j!=0 || i==n-1 && j!=n-1 || i==n/2 && j!=0 && j!=n-1 || j==0 && i!=0 && i<n/2 || j==n-1 && i>n/2 && i!=n-1)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(i==0||i==n-1||j==n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  System.out.print(" ");
    	  
    	  for(int j=0;j<=n-1;j++)
  		{
  			if(j==0 || i==0 && j<n/2 ||( i==1 || i==2) && j==n/2 || i==n/2 && j<n/2 || i-j==n/2 && i>n/2)
  			{ System.out.print("*");
  			}
  			else
  			{System.out.print(" ");
  			}
  		}
    	  
      System.out.println();
	}
}
}
