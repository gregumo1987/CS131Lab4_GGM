import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String>stringList=new ArrayList<String>();
	private Scanner input;


	public FileProcessor(String fileName, int stringLength) {
		setstringLength(stringLength);
		
		setfileName(fileName);	
	}
	
	
	
	public int getArrayListSize() {
		return stringList.size();
	}
	
	
	public void processFile() {
		
		
		StringTooLongException eX=new StringTooLongException();
		
		try {
			input=new Scanner(new File(fileName));
			while(input.hasNext())
			{
				String sL=input.nextLine();
				if(sL.length()> stringLength) //if read file string length is greater than stringLength throw exception
				throw eX;	
				else {
				stringList.add(sL);
				}
			}
			
		} 
		
		catch (FileNotFoundException e) {
			
			System.out.println(e);
		}
		catch(StringTooLongException e) {
			System.out.println(e);
		}
		
		
	}
	public String getfileName() {
		return fileName;
	}
	
	public void setfileName(String s) {
		this.fileName=s;
		
	}
	public int getstringLength() {
		return stringLength;
	}
	
	public void setstringLength(int sL) {
		if(sL>= 5) {
			this.stringLength=sL;
		}
		else {
		this.stringLength=5;	
		}
	}	
	   @Override
	   public String toString() {
	   return "ReadFile [fileName=" + fileName + ", stringLength=" + stringLength + "]";
	   }
	
}