import java.io.*;
 public class TestOuter{
    static int data=30;
    static class TestInner{
        void msg(){
            System.out.println("Data is "+data);
        }
    }
    public static void main(String args[]){
        TestOuter.TestInner obj=new TestOuter.TestInner();
        obj.msg();
    }
}