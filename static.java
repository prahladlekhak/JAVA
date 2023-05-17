class Test{
    int a=1,b=-1;//instance variable
    static int k=5;//static variable is the member of class and we cant create copies
    void setA(int x){//instance method
        a=x;
    }
    void setB(int y){
        b=y;
    }
    static void setC(int z){//static method
        k=z;
    }
}
class HelloWorld{
    public static void main(String []args){
        Test t1=new Test();
        Test t2=new Test();
        t1.setA(5);
        t1.setB(25);
        Test.setC(55);
        System.out.println("a="+t1.a+"b="+t1.b);
        System.out.println("a="+t2.a+"b="+t2.b);
        System.out.println(Test.k);
       
    }
}