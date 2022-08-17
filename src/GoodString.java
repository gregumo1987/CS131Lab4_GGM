
public class GoodString {

	public static void main(String[] args) {
	
		FileProcessor fp=new FileProcessor("GoodString.txt",5);
		fp.processFile();
		System.out.println(fp.getfileName());
		System.out.println(fp.getArrayListSize());
		
		
	}

}