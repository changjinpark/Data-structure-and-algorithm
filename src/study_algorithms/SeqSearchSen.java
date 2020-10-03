package study_algorithms;

import java.util.Scanner;

public class SeqSearchSen {

	static int SeqSearchSen(int[] x, int num, int Search_key) {
		
		x[num] = Search_key;
		
		int i = 0;
		
		while(true) {
			if(x[i] == Search_key)
				break;
			i++;
		}
		return i == num ? -1 : i;
	}
	
	
	public static void main(String[] args) {

		System.out.println("요솟수 : ");
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		int[] x = new int[num + 1];
		
		for(int i = 0 ; i<num ; i++) {
		System.out.println("x["+i+"] : ");
		x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int Search_key = stdIn.nextInt();
		
		int idx = SeqSearchSen(x, num, Search_key);

		if(idx<0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(x[idx]+"은(는) x["+idx+"]에 있습니다.");
		
	}

}
