
//SINGLE LEVEL  INHERITANCE


// import java.util.Scanner;

// class A {
//     int a,b;
//     void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value of a: ");
//     a=sc.nextInt();
//     System.out.print("Enter the value of b: ");
//     b=sc.nextInt();
//     }
//     void add(){
//         System.out.println("The sum of a and b is: "+(a+b));
//     }
// }
// class B extends A{
//     int c;
//     void getdata(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value: ");
//     c=sc.nextInt();
//     }
//     void display(){
//         System.out.println("Sum of a,b and c : "+(a+b+c));
//     }
// }
// class C {
//     public static void main(String[] args) {
//         B s1=new B();//class name(B) then object name(s1)=new class
//         s1.input();
//         s1.getdata();
//         s1.display();
//         s1.add();
//     }
// }





//MULTI LEVEL INHERITANCE


// import java.util.Scanner;

// class A{
//     int a;
//     void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value of a: ");
//     a=sc.nextInt();
//     }
// }
// class B extends A{
//     int b;
//     void getvalue(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value of b: ");
//     b=sc.nextInt();
//     }
// }
// class C extends B{
//     int c;
//     void getdata(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value of c: ");
//     c=sc.nextInt();
//     }
//     void display(){
//         System.out.println("Sum of a,b and c : "+(a+b+c));
//     }
// }

// class D {
//     public static void main(String[] args) {
//         C s1=new C();//class name(B) then object name(s1)=new class
//         s1.input();
//         s1.getvalue();
//         s1.getdata();
//         s1.display();
//     }
// }




//HEIRARCHIAL INHERITANCE


// import java.util.Scanner;

// class A{
//     int a;
//     int b;
//     void input(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the value of a: ");
//     a=sc.nextInt();
//     System.out.print("Enter the value of b: ");
//     b=sc.nextInt();
//     }
// }

// class B extends A{
   
    
//     void display(){
//         System.out.println("Sum of a and b is : "+(a+b));
//     }
// }
// class C extends A{
   
    
//     void thisplay(){
//         System.out.println("Difference of a and b is: "+(a-b));
//     }
// }

// class D {
//     public static void main(String[] args) {
//         B s2=new B();
//         C s3=new C();
//         s2.input();
//         s2.display();
//         s3.input();
//         s3.thisplay();
//     }
// }





//HYBRID INHERITANCE
//TWO OR MORE TYPES OF INHERITANCE


//MULTIPLE INHERITANCE
//ONE CLASS INHERITS 2 CLASSES
//BUT IT ISN'T SUPPORTED IN JAVA THROUGH  CLASS






