package bbb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class Text  {

	public static void main(String[] args) throws IOException {
		Person p=new Person();
		String str=p.toString("tom", 22, "男", "是一个帅气的人");
		System.out.println(str);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.obj"));
		oos.writeObject( str);
		oos.close();
		RandomAccessFile desc=new RandomAccessFile("person.obj","rw");
		System.out.println(desc.read());
			
		
	}

}
