package com.week1;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sub=0;
		try {
			Sub = (int) System.in.read();
			if(Sub>300||Sub<0){
				System.out.println("The Input Is Wrong!");
				return;
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int SUM=0;
		for(int i=1;i<Sub;i++){
			SUM=SUM+i;
		}
		System.out.println("The Sum Num Is:"+SUM);
	}

}
