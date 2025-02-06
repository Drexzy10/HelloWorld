package FirstApp;

class Calculator {
    public int add(int n1, int n2){
        System.out.println("in add");
        int r = n1 + n2;
        return r;
    }

}
        
class Object {
public static void main(String[] args) {
    //Class and object
    int num =6;
    int num2 =8; 
    Calculator c = new Calculator();
    int result = c.add(num, num2);
    System.out.println(result);

}
    
}