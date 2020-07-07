package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;



public class Data_Read_Csv {

	 public static void main(String[] args) throws Exception {
	//"C:\\Users\\SalmaMurmu\\Downloads\\CompletionReport-2020.csv";   
//	private static final String FILE_PATH="C:\\Users\\SalmaMurmu\\Desktop\\Manipal\\CompletionReport-2020.csv";
//
//	@Test
//	public void test() throws Exception {
//	CSVReader reader = new CSVReader(new FileReader(FILE_PATH));
//	String [] nextLine;
//	while ((nextLine = reader.readNext()) != null) {
//	System.out.println("Value 1 : [" + nextLine[0] + "]\nValue 2 : [" + nextLine[1] + "]\nValue 3 :[" + nextLine[2] + "]\nValue 4 :[" + nextLine[3] + "]");
	CSVReader reader = new CSVReader(new FileReader("C:\\Users\\SalmaMurmu\\Desktop\\Manipal\\CompletionReport-2020.csv"));

	  List<String[]> list=reader.readAll();
	  System.out.println("Total rows which we have is "+list.size());
	            
	 // create Iterator reference
	  Iterator<String[]>iterator= list.iterator();
	    
	 // Iterate all values 
	 while(iterator.hasNext()){
	     
	 String[] str=iterator.next();
	   
	 System.out.print(" Values are ");

	 for(int i=0;i<str.length;i++)
	{

	   System.out.print(" "+str[i]);

	}
	   System.out.println("   ");
	     
	    
	}

	}

	
	
}
	

			

