package FirstApp;

public class Exercise {
    public static void main(String[] args){
        int arr[][] = new int[3][2];
        
        for(int i=0; i<3; i++){
            
            for(int j=0; j<2; j++){
                arr[i][j] = (int)(Math.random()*100);
                System.out.println(arr[i][j] + " ");
            //System.out.println(m);

            }
        }
    }
    
}
