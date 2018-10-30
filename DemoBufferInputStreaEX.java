package application;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DemoBufferInputStreaEX {
public static void main(String[] args) {
	
	//Buffered input stream is used to speed up input and out by reducing the disk read and write.
	File Sfile= new File("demo.dat");
	File dfile=new File("demo1.dat");
	try {
	BufferedInputStream input= new BufferedInputStream(new FileInputStream(Sfile));
} catch(Exception e) {
	
}
}
}
