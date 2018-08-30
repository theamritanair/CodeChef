import java.util.Scanner;
public class BigMultiplication{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int t;
	t = sc.nextInt();
	int[][] nm = new int[t][2];
	for(int i=0;i<t;i++){
		for(j =0;j<2;j++){
			nm[i][j]= sc.nextInt();
		}
	}
	for(int i=0;i<t;i++){
			System.out.println((nm[i][0]*nm[i][1])/3);
		}
	}

	}