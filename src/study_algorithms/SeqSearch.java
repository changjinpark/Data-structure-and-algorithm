package study_algorithms;

import java.util.Scanner;

public class SeqSearch {
	
	static int seqSearch(int[] x, int num, int key) {
		
		int i = 0;
		while(true) {
			if(i == num)
				return -1;
			if(x[i] == key)
				return i;
			i++;
		}
		
		/* for문		
				for(int i = 0 ; i<num ; i++) {
					if(x[i] == key)
						return i;			
				}
				return -1;
		*/		
	}

	public static void main(String[] args) {

		System.out.println("요솟수 : ");
		
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num ; i++) {
			System.out.println("x["+i+"] : ");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int search_value = stdIn.nextInt();
		
		int idx = seqSearch(x, num, search_value);
		
		//stdIn.close();
		
		if(idx<0)
			System.out.println("값의 요소가 없습니다.");
		else
			System.out.println(x[idx] + "은(는) x["+idx+"]에 있습니다.");
		
	}

}
