import java.util.ArrayList;
import java.util.Scanner;
class RevDirections{
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
 
        for (int i=0;i<test;i++){
 
            int l = sc.nextInt();
            sc.nextLine();
            ArrayList <String> direct = new ArrayList<>();
 
            for(int j=0; j< l;j++){
		
                direct.add(sc.nextLine());
 
            }
 
            System.out.println("Begin"+ (direct.get(l-1).substring(direct.get(l-1).indexOf(" "))));
            for(int a=l-1;a>0;a--){
                if(direct.get(a).startsWith("Right")){
                    System.out.println("Left"+ (direct.get(a-1).substring(direct.get(a-1).indexOf(" "))));
 
                }
                else{
                    System.out.println("Right"+ (direct.get(a-1).substring(direct.get(a-1).indexOf(" "))));
                }
            }
 
            System.out.println();
        }
	
        sc.close();
    }
    
    
}