package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int x=1;
		int i=0;	
		System.out.print("數列一："+" ");
		while(n>=x){
			x+=i;
			i++;
			System.out.print(x+" ");			
		}
		System.out.println("");
		int y=1;
		int j=0;
		System.out.print("數列二："+" ");
	    while(y<=n){    	
	    	for(j=0;j<y;j++){
	    	System.out.print(y+" ");}
	    	y++;
	    }
	}
}
