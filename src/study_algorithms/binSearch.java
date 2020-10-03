package study_algorithms;

import java.util.Scanner;

public class binSearch {
	
	static int binSearch(int[] x, int num, int Search_key){
		
		int first_idx = 0;
		int last_idx = num-1;
		
		do {
			int center_idx = (first_idx+last_idx)/2;
			
			if(x[center_idx] == Search_key)
				return center_idx;
			else if(x[center_idx] < Search_key)
				first_idx = center_idx+1;
			else
				last_idx = center_idx-1;
				
		}while(first_idx <= last_idx);
		
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println("요솟수 : ");
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int[] x = new int[num];
		System.out.println("오름차순으로 입력하세요");
		for(int i = 0 ; i<num ; i++) {
			System.out.print("x["+i+"] : "); x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : "); int Search_key = stdIn.nextInt();
		
		int idx = binSearch(x, num, Search_key);
		
		if(idx<0)
			System.out.println("찾는 요소가 없습니다.");
		else
			System.out.println(x[idx]+"는 x["+idx+"]에 있습니다.");
		
	}
}
