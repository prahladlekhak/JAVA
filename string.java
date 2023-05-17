// import java.util.Scanner;

// class string {
//     public static void main(String[] args) {
    //String name="Palak Joshi";
    // int vc=0;
    // int nv=0;
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Please enter name: ");
    // String name=sc.nextLine();
    // System.out.println("Total length: "+name.length());
    // System.out.println("Upper case: "+name.toUpperCase());
    // System.out.println("Lower case: "+name.toLowerCase());
    //System.out.println(name.substring(4,10));
    //System.out.println(name.replace("P","B"));
    // System.out.println(name.endsWith("shi"));
    // System.out.println(name.startsWith("Pal"));
    // System.out.println(name.indexOf("a"));
    // System.out.println("Trimmed: "+name.trim());
    // for(int i=0;i<name.length();i++){
    //     System.out.println( i+":"+name.charAt(i));
    // }
    // for(int i=name.length()-1;i>=0;i--){
    //     System.out.print(name.charAt(i));
    // }
    //  for(int j=0;j<name.length();j++){
    //     if(name.charAt(j)=='a'||name.charAt(j)=='e'||name.charAt(j)=='i'||name.charAt(j)=='o'||name.charAt(j)=='u'){
    //         vc+=1;
    //     }
        
    //     else{
    //         nv+=1;}
            
    //     }
    //     System.out.println("Total vowels : "+vc);
    //         System.out.println("Not vowels: "+nv); 

    // }
    // }

// import java.util.Scanner;

// class string{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter the name: ");
//             String name=sc.nextLine();
//             String rev="";
//             for(int i=name.length()-1;i>=0;i--){
//                 rev=rev+name.charAt(i);
//             }
//             System.out.println(rev);
//             if(name.equals(rev)){
//                 System.out.println("String is palindrome");
//             }
//             else{
//                 System.out.println("String is not palindrome");
//             }
//         }
//     }

// import java.util.Scanner;

// class string{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter the name: ");
//             String name=sc.nextLine();

//             System.out.println(name.replace(" ","@"));
//         }
//     }


// import java.util.Scanner;

// class string{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter the name: ");
//             String name=sc.nextLine();
//             for(int i=0;i<name.length();i++){
//             char ch=name.charAt(i);
//             if(Character.isUpperCase(ch)){
//             System.out.print(Character.toLowerCase(ch));
//             }
//         else{
//             System.out.print(Character.toUpperCase(ch));
//         }}
//     }}


// import java.util.Scanner;

// class string{
//         public static void main(String[] args) {
//             int ac=0,dc=0;
//             Scanner sc=new Scanner(System.in);
//             System.out.print("Enter the name: ");
//             String name=sc.nextLine();
//             for(int i=0;i<name.length();i++){
//             char ch=name.charAt(i);
//             if(Character.isAlphabetic(ch)){
//             ac+=1;
//         }
//         else if(Character.isDigit(ch)){
//             dc+=1;
//         }}
//         int a=ac+dc;
        
        

//         System.out.println("The alphabet count percent is: "+(float)ac/a*100);
//         System.out.println("The digit count percent is: "+(float)dc/a*100);
    
//     }}

// import java.util.Scanner;

// class string{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the alphabet: ");
//     char name=sc.next().charAt(0);
//     System.out.println((int)name);
//     }
// }


// import java.util.Scanner;

// class string{
//     public static void main(String[] args) {
//         int sum=0;
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter the alphabet: ");
//     String name=sc.next();
//     for(int i=0;i<name.length();i++){
//     System.out.println(name.charAt(i)+":"+(int)name.charAt(i));
//     sum+=(int)name.charAt(i);}
//     System.out.println("The sum of the alphanets are: "+sum);
//     }
// }







