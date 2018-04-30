package test2;

public class PrintShapes {
	/**
	 * Prints a rectangled w/ specified parameters
	 * @param width Width
	 * @param height Height
	 */
	public static void PrintRectangle(int width, int height) {
		for(int i = 0; i < width; i++) {
			System.out.print("^");
		}
		System.out.println();
		for(int i = 0; i < height - 2; i++) {
			System.out.print("^");
			for(int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("^");
		}
		for(int i = 0; i < width; i++) {
			System.out.print("^");
		}
		System.out.println();
	}
}
