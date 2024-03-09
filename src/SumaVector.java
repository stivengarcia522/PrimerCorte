
public class SumaVector {
    public static void main(String[] args){

        int [] vector = {2,4,6,8,10};
        int total = 0;

        for (int i = 0;i<vector.length;i++){
            total= total + vector[i];
        }
        System.out.println("la suma es: " + total);

    }
}
