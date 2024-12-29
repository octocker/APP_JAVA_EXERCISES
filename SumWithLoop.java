public class SumWithLoop {
    public static void main(String[] args) {
        
        //With for loop
        int Sum_For = 0;
        for (int a = 1; a < 11; a++) {
            Sum_For += a;
        }
        System.out.println("Sum with for loop: " + Sum_For);

        //With do while loop
        int Sum_D_While = 0;
        int b = 1;
        do {
            Sum_D_While += b;
            b++;
        } while (b <= 10);
        System.out.println("Sum with do while: " + Sum_D_While);

        //With while loop
        int Sum_While = 0;
        int c = 1;
        while (c <= 10) {
            Sum_While += c;
            c++;
        }
        System.out.println("Sum using while loop: " + Sum_While);
    }
}
