import java.util.List;


public class Main {
	public static void main(String[] args) {
//		String input = "abcabacaa";
//		Huffman h = new Huffman(input);
//		String encoding = h.encode();
//		System.out.println(encoding);
//		String decoded = h.decode(encoding);
//		System.out.println(decoded);
		
		int[][] grid = new int[][]{
			{5, 1, 1},
			{20, 4, 7},
			{30, 6, 3}
		};
		
		int[][] min = new int[3][3];
		List<GreedyDynamicAlgorithms.Direction> list = GreedyDynamicAlgorithms.optimalGridPath(grid);
		for (GreedyDynamicAlgorithms.Direction dir : list) {
			System.out.println(dir);
		}
		
	}
	
	
}
