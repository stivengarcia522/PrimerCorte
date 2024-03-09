public class ElemntoMaximo {
    public static void main(String[] args) {
         int [] vector = {85,45,78,1,59,147,15,74,35,45};
         int e = 0;

        for (int i = 0;i<vector.length;i++){
            if(vector[i]>e){
                e=vector[i];
            }
        }
        System.out.println("el numero mayor es: " + e);
    }
}
