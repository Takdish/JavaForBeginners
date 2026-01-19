public class PalPalLyrics {

    public static void main(String[] args) throws InterruptedException {
        printLyrics();
    }

    public static void printLyrics() throws InterruptedException {
        String[] lyrics = {
                "Mein ab kyun hosh may aata nahi?",
                "Sukoon yeh dil kyun paata nahi?",
                "Kyun torrun khud se jo thay waaday",
                "Ke ab yeh ishq nibhaana nahi?",
                "Mein morrun tum se jo yeh chehra",
                "Dobara nazar milana nahi",
                "Yeh duniya jaanay mera dard",
                "Tujhe yeh nazar kyun aata nahi?"
        };

        double[] delays = { 0.3, 0.3, 0.4, 0.3, 0.3, 0.3, 0.8 };

        System.out.println("pal pal : ");
        Thread.sleep(1200); // 1.2 seconds

        for (int i = 0; i < lyrics.length; i++) {
            String line = lyrics[i];

            // Typewriter effect
            for (int c = 0; c < line.length(); c++) {
                System.out.print(line.charAt(c));
                System.out.flush();
                Thread.sleep(60); // 0.06 seconds
            }

            System.out.println();

            // Delay after each line
            if (i < delays.length) {
                Thread.sleep((long) (delays[i] * 1000));
            } else {
                Thread.sleep(800);
            }
        }
    }
}
