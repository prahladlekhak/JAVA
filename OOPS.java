//     class Student {//instance variables defined inside a class
//       int Rollno;
//       String Name;
//       double Marks;

//     public void setdata(int x,String y,double z) {//local variables available until lifetime of function ie:till execution
//       Rollno=x;
//       Name=y;
//       Marks=z;  
//     }

//     public void showdata(){
//        System.out.println("Rollno is: "+Rollno);
//        System.out.println("Name is: "+Name);  
//        System.out.println("Marks are: "+Marks); 
//     }
//     public static void main(String[] args) {
//         // Student s1=new Student();
//         // Student s2=new Student();
//         // s1.setdata(01,"Bobby",100.00);
//         // s2.setdata(02,"Palak",100.00);
//         // s1.showdata();
//         // s2.showdata();
//         Student s1=new Student();
//         s1=new Student();//new returns address of memory allocated
//         s1.setdata(01,"Bobby",100.00);
//         s1.setdata(02,"Palak",100.00);
//         s1.showdata();
//     }
// }



