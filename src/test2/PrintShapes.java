package test2;

public class PrintShapes {
	public static void PrintRectangle(int width, int height) {
		for(int i = 0; i < width; i++) {
			System.out.print("^");
		}
		for(int i = 0; i < height - 2; i++) {
			System.out.println("^");
		}
		for(int i = 0; i < width; i++) {
			System.out.print("^");
		}
	}
}
