class Demo{
    public void booting(){
        System.out.println("System is booting");
    }
    public int bike(int price){

            return price;
    }
// Method overload
    public int sub(int m1, int m2){
        return m1 - m2;
    }
    public int sub(int m1, int m2, int m3){
        return m1 + m2 + m3;
    }
    public float sub(float m1, float m2){
        return m1 + m2;
    }
        
            
        }
        

    


public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(8 + 5);
        // System.out.println("Hello, World!");
    
        //Methods
        // Demo obj = new Demo();
        // obj.booting();
        // System.out.println(obj.bike(1200));

        //Method overload
        Demo obj = new Demo();
        ;
        System.out.println(obj.sub(10, 5));
        System.out.println(obj.sub(13, 16, 30));
        System.out.println(obj.sub(1.9f, 3.5f));

        

    }
}
