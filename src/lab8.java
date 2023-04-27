import java.io.IOException;
import java.io.RandomAccessFile;

public class lab8 {
	public static void main(String[] args) {
		
		try {
			RandomAccessFile ioStream =  new RandomAccessFile("integers.data", "rw");
			int oneInt;
			
			System.out.println("Numbers: ");
			for (int i = 0; i < (ioStream.length()); i += 4) {
				oneInt=ioStream.readInt();
				if (oneInt%2==0) {
					oneInt+=100;
					ioStream.seek(ioStream.getFilePointer()-4);//getfilepointer tells you where you are at, seek actually moves the file pointer
					ioStream.writeInt(oneInt);
				}
			}
			
			ioStream.seek(0);
			for (int i1 = 0; i1 < (ioStream.length()); i1 += 4) {
				oneInt=ioStream.readInt();
				System.out.println(oneInt);
			}
			
			ioStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
