package Sprint02;

public class DrawFigures {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        drawline();
        drawcross();

        drawcut();

        drawline();
        drawcross();
        drawline();

        drawcut();
        for (int i=0; i<3; i++) {
            drawstar();
        }
        drawline();
        drawcross();
    }
    public static void drawline() {
        System.out.println("\t*****\n\t*****");
    }
    public static void drawcross() {
        System.out.println("\t * *\n      *\n\t * *");
    }
    public static void drawcut() {
        System.out.println();
        System.out.println();
    }
    public static void drawstar() {
        System.out.println("\t  *");
    }
}
