public class ProductoParesVector {
    public static void main(String[] args){

        int [] vector = {2,1,6,5,10,11,25,3};
        int producto = 1;

        for (int i = 0;i<vector.length;i++){
            if(vector[i] % 2 == 0){
                producto = producto * vector[i];

            }

        }
        System.out.println("el producto es: " + producto);

    }
}
