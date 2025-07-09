package dsa.mca.exception;

public class DemoException {

	public static void main(String[] args) {
		//FileInputStream f=new FileInputStream("data.txt");
     int a=10;
     int b=0;
     int c;
     try
     {
      c=a/b;
     }
     catch (Exception e) {
     System.out.println(e);
	}
	}
}
