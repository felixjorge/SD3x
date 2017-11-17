
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
			{2, 4, 7},
			{2, 4, 5},
			{5, 6, 3}
		};
		
		int[][] min = new int[4][4];
		int minPath = GreedyDynamicAlgorithms.minPath(grid, 0, 0, min);
		System.out.println(minPath);
		
	}
	
	
}
