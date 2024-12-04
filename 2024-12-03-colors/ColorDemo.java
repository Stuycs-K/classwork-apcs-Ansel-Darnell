public class ColorDemo {
    public static void main(String[] args) {
        draw((2000 * 50), 239); // Draw 100 blocks, with 50 blocks per row
    }

    public static void draw(int times, int col) { // Randomly draws a "polluck" of n blocks
        String block = "█";
        for (int i = 0; i < times; i++) {
            String thing = "\u001b[";
            int colorCode = (int) (Math.random() * 8) + 30;
            System.out.print(thing + colorCode + "m");
            System.out.print(block);
            if ((i + 1) % col == 0) {
                System.out.println();
            }
        }
        System.out.println("\u001b[0m");
    }
}
