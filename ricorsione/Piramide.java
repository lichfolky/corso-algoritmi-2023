package ricorsione;

public class Piramide {
    public static void main(String[] args) {
        int n = 7;
        stampaPiramideRicorsivo(n);


        /* 
            System.out.println("******");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        */
    }
    
    // O( n  + (n - 1) + (n - 2) + ...  + 1 )

    /*
     *  n  + (n - 1) + (n - 2) + ...  + 1 = T(n)
     */

     // n  + (n - 1) + (n - 2) + ...  + 1 
     // +
     // 1 + ...+ (n - 2) + n - 1 + n
     // = 2 * T(n)

     // (n + 1)  + ((n - 1) + 2) + ...  + (1 + n) = 
     // (n + 1) * n = 2 T(n)
     
     // (n^2 + n) / 2 
     // O(n) = (n^2)


    public static void stampaPiramide( int n ){ 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void stampaPiramideRicorsivo( int n ){ // 7 6 ... 

        // assicurati sempre che ci sia una condizione di terminazione
        if(n > 0){

            stampaPiramideRicorsivo(n - 1); // 6 5

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
