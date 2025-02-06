package FirstApp;

class Looop {
    
   
    public static void main(String[] args) {
        //Loop(While loop, Nested Loop,)
       
        // int i = 1;
        // while(i<=4){
        // System.out.println("Hi " + i);
        // int j = 1;
        // while (j<=3) {
        //     System.out.println("Hello " + j);
        //     j++;
        // }
        // i++;
       
        //Do-while
        int m = 8;
        do{
            System.out.println("Hello " + m);
        m++;
        }while(m<=6); 

        //For Loop
        for(int i=1; i<=5; i++){
            System.out.println("Day " + i);
            for(int j=1; j<=9; j++){
                System.out.println(" " + (j+8) + "-" + (j+9));

            }

        }
        
    
        
            
        

   
    
    
}
}