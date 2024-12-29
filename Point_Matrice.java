class Point {
    int X;
    int Y;
    Point(int x, int y) {
        X = x; Y = y;
    }

   
    void Display() {
        System.out.println("(" + X + ","+ Y +  ")");

    }
}

public class Point_Matrice{
    public static void main(String[] args) {
        
        Point[][] Matrice = new Point[2][3];

        
        Point P1 = new Point(1, 2);
        Point P2 = new Point(3, 4);
        Point P3 = new Point(5, 6);
        Point P4 = new Point(7, 8);
        Point P5 = new Point(9, 10);

       
        Matrice[0][0] = P1;
        Matrice[0][1] = P2;
        Matrice[0][2] = P3;
        Matrice[1][0] = P4;
        Matrice[1][1] = P5;

        System.out.println("Mtrice de points:");
        for (Point[] row : Matrice) {
            for (Point P : row) {
                if (P != null) {
                    P.Display();    
                } 
                else {
                    System.out.println("(null)"); 
                }
            }
        }
    }
}

