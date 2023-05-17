//  class Box {
//     int length,breadth,height;//instance variable
//     static int k;
//     void setDimension(int x,int y,int z){//local variable
//         length=x;
//         breadth=y;
//         height=z;
//     }
//     void showDimension(){
//         System.out.println("Length: "+length);
//         System.out.println("Breadth: "+breadth);
//         System.out.println("Height: "+height);
//         System.out.println("value of k is "+k);
//     }
//     static void setk(int p){
//         k=p;
// }}

//     class Objects{
//     public static void main(String[] args) {
        
//         Box a=new Box();
//         Box.setk(7);
//         a.setDimension(10, 20, 30);
//         a.showDimension();
//         Box b=new Box();
//         b.setDimension(107, 207, 307);
//         b.showDimension();
//         Box c=new Box();
//         c.setDimension(70, 20, 37);
//         c.showDimension();
        

//         //System.out.println("length of a:" +a.length);
//     }
// }

// import java.util.Scanner;

// class Account{
//     int Accno;//member variable or instance variable
//     String name;
//     int Year;
//     double total;
//     int principal;
//     static double ROI=10.5;
//     public void setdata(){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter you name: ");
//     String n=sc.nextLine();
//     System.out.print("Enter Accno: ");
//     int x=sc.nextInt();
//     System.out.print("Enter years: ");
//     int y=sc.nextInt();
//     System.out.print("Enter amount: "); 
//     int z=sc.nextInt();

//     Accno=x;
//     principal=y;
//     Year=z;
//     name=n;
//     total=principal+principal*ROI*Year/100;
//     }
//     public void showdata(){
//         System.out.println("Account no  is "+Accno);
//         System.out.println("Principal is "+principal);
//         System.out.println("Time duration  is "+Year);
//         System.out.println("Account holder name  is "+name);
//         System.out.println("Interest is "+total);
//     }

// }
// class bankacc{
//     public static void main(String[] args) {
//     Account a1=new Account();
//     a1.setdata();
//     a1.showdata();
//     }   
// }
