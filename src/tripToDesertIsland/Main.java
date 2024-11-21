package tripToDesertIsland;

import java.util.Arrays;

public class Main {
//	final static Solution241119 solution241119 =  new Solution241119();
	final static Solution241120 solution241120 =  new Solution241120();
	final static Solution solution = new Solution();
	
	public static void main(String[] args) {
		String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
//		System.out.println(Arrays.toString(solution241120.solution(maps)));
		System.out.println(Arrays.toString(solution.solution(maps)));
	}
}
