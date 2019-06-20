import java.io.*;

public class Serialisation {

	public static void main(String[] args) throws Exception{
		test t=new test();
		dog d=new dog();
		rat r=new rat();
		
		FileOutputStream fos=new FileOutputStream("xyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.writeObject(d);
		oos.writeObject(r);
		oos.flush();
		oos.close();
		FileInputStream fis=new FileInputStream("xyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		test t2=(test)ois.readObject();
		dog d2=(dog)ois.readObject();
		rat r2=(rat)ois.readObject();
		ois.close();
		System.out.println(t2.i+"  "+d2.i+" "+r2.i);
		
		
		
		

	}

}
