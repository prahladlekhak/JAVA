// class loop {
//     public static void main(String [] args) {
//         int i=1;
//         while (i<=10){
//             System.out.println("2*"+i+"="+2*i);
//             i++;
//         }
//     }
// }
// class loop {
//     public static void main(String [] args) {
//         int i=1;
//         do{
//             System.out.println("Bobby");
//             i++;
//         }
//         while (i<=0);
//     }
// }


// class loop {
//     public static void main(String [] args) {
//         int i;
//         //for(i=10;i>0;i--){
//         for(i=1;i<=10;i++){
//             System.out.println(17+"*"+i+"="+17*i);
           

//     }
//     }
// }
// class Prime {
//     public static void main(String [] args) {
//         int i;
//         int a=12    ;
//         int count=0;
//         for(i=1;i<=a;i++){
//            if (a%i==0){
//             count+=1;
//            }
        
//            }
//            if (count==2){
//             System.out.print("it is a prime number");
//            }
//            else{
//             System.out.print("it is no t a prime number");
//            }
//     }
//     }


// class Prime{
//     public static void main(String [] args) {
//         int j;
//         int i;
        
//         for(i=1;i<=100;i++){
//             int count=0;
//         for(j=1;j<=i;j++){
//            if (i%j==0){
//             count+=1;
//            }
        
//            }
//            if (count==2){
//             System.out.println(i);
//            }
          
//     }}
//     }

// class armstrong{
//     public static void main(String [] args) {
//        int i,sum,r,temp ;
//        for(i=1;i<=500;i++){
//         sum=0;
//         temp=i;
//         while(temp!=0){
//             r=temp%10;
//             sum+=r*r*r;
//             temp=temp/10;
//         }
//         if(i==sum){
//         System.out.println(i);
//         }
//        }
//     }  
// }



// class breakk{
//         public static void main(String [] args) {
//             int i,j;
//             first:for(i=1;i<10;i++){
//                 for(j=1;j<=5;j++){
//                     if(i+j>8){
//                         break first;
//                     }
//                     System.out.println(i+j);
//                 }
//             }
//         }}


// class star{
//         public static void main(String [] args) {
//             int i,j;
//             for(i=1;i<=5;i++){
//                 for(j=1;j<=5;j++){
//                     if(j>i){
//                         System.out.print("* ");
//                         continue;
//                     }
                    
//                 }
//                 System.out.println("");
//             }
//         }}


// class forech{
//         public static void main(String [] args) {
//             int arr[]={5,6,7,8,9};
//             for (int i : arr) {
//                 System.out.println(i);
//             }
           
//         }}


// class datatypes{
//         public static void main(String [] args) {
//             int w=7;
//             //char w='a';
//             switch(w){
//                 case 1:System.out.println("Monday");break;
//                 //case 'a':System.out.println("Monday");break;
//                 case 2:System.out.println("Tuesday");break;
//                 case 3:System.out.println("Wednesday");break;
//                 case 4:System.out.println("Thursday");break;
//                 case 5:System.out.println("Friday");break;
//                 case 6:System.out.println("Saturday");break;
//                 case 7:System.out.println("Sunday");break;
//             }
//         }}


// class ascii{
//            public static void main(String [] args) {
//             char a='a';
//             int value=a;
//             System.out.println(value);

//            }}


// class vowel{
//            public static void main(String [] args) {
//             char input='m';
//            if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U'){
//             System.out.println("It is vowel");
//            }
//            else{

//            }
//             System.out.println("it is consonent");

//            }}




// class leap{
//                public static void main(String [] args) {
//                 int year=2003;
//                 if(year%4==0 && year%100!=0 || year%400==0){
//                     System.out.print("it is a leap year");
//                 }
//                 else{
//                     System.out.print("it is not a leap year");
//                 }
            
//                }}



// class Compound{
//                public static void main(String [] args) {
//                double CI,P=500,r=10,t=2;
//                 CI=P*(Math.pow((1+r),t));
//                 System.out.print(CI);
//                 }
            
//                }


