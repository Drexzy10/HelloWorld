package FirstApp;
    //Array of Objects
    class Student{
        String name;
        int rollnum;
        int marks;
                

    }  
public class Arrayy {
    public static void main(String[] args){
        //Single array
        // int num[] = new int[6];
        // num[0] = 12;
        // num[1] = 10;
        // num[2] = 26;
        // num[3] = 36;
        // num[4] = 19;
        // num[5] = 88;
        // for(int i =0; i<6; i++){
        //     System.out.println(num[i]);        
        
        //Multi-dimensional array
    //   int doub[][] = new int[3][3];
      
    //   for(int i=0; i<3; i++){
    //     for(int j=0; j<3; j++){
    //         doub[i][j] = (int)(Math.random()*100);
           
        //}
       //}
// for(int i=0; i<3; i++){
//         for(int j=0; j<3; j++){
//             System.out.println(doub[i][j] + " ");
//         }
//         System.out.println();
    //    for(int c[] : doub){
    //     for(int m : c){
    //         System.out.println(m);

    //     }
    //     System.out.println();
    //    }

    //Array of Objects
    Student s = new Student();
    s.name = "Drexzy";
    s.rollnum = 15;
    s.marks = 76;
    Student s1 = new Student();
    s1.name = "Nahum";
    s1.rollnum = 32;
    s1.marks = 50;
    Student s3 = new Student();
    s3.name = "Rachel";
    s3.rollnum = 10;
    s3.marks = 54;

    Student st[] = new Student[3];
     st[0] = s;
     st[1] = s1;
     st[2] = s3;

        //Enhanced for loop
        for(Student b: st){
            System.out.println(b.name + " : " + b.rollnum + " : " + b.marks);
        }
    // for(int i=0; i<st.length; i++){
    //     System.out.println(st[i].name + " : " + st[i].rollnum + " : " + st[i].marks);
    }
}

    
     



    
    


        

    
    

