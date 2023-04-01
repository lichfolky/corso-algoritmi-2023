package ricerca;

public class Ricerca {

    public static int ricercaLineare(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

}