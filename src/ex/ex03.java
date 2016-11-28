package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int x=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.print(i+"\t");
				for(int j=2;j<i;j++){
					if(i%j==0){
						x=1;					
						}
				}
				if(x==0){
					System.out.println("此數為質數");
				}else if(x==1){
					System.out.println("此數非質數");
					x=0;
				}
		    }	
		}
	}
}