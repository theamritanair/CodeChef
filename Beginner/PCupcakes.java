    import java.util.Scanner;
     
     class PCupcakes{
    	
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int t;
    		t = sc.nextInt();
    		int a;
    		for(int i=0;i<t;i++)
    	   {
    	       a = sc.nextInt();
    	         
    	       int cup = a/2 + 1;
    	       System.out.println(cup);
    	   }
    	}
    } 