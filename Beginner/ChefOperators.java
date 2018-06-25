import java.util.Scanner;
 
class ChefOperators{
 
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int t;
	t= sc.nextInt();
	for(int i=0;i<t;i++){
		int a= sc.nextInt();
		int b= sc.nextInt();
		if(a<b){
		System.out.println("<");
		}
		else if(a>b){
		System.out.println(">");
		}
		else 
		System.out.println("=");
	}
	}
	}