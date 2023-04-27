
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GenerateIntegers
{
  public static void main(String[] args)
  {
	  int num;
     try
     ( RandomAccessFile ioStream =
           new RandomAccessFile("integers.data", "rw");
     )		 {
    	 System.out.println("Writing...");
    	 for (int i=0; i<(int)(Math.random()*100); i++) {
    		 num = (int)(Math.random()*100);
    		 System.out.println(num);
             ioStream.writeInt(num);
    	 }  	

     }
     catch(FileNotFoundException e)
     {
         System.out.println("Problem opening file.");
     }
     catch(IOException e)
     {
         System.out.println("Problems with file I/O.");
     }
     System.out.println("End of program.");
  }
}
