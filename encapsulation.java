class encapsulation {
    private int empid=90;
    public void setdata(int emp_id){
        empid=emp_id;
    }
    public int showdata(){
        return empid;
    }}

class capsule extends encapsulation{

public static void main(String[] args) {
    encapsulation t=new encapsulation();
    t.setdata(787);
    System.out.println(t.showdata());
}}
