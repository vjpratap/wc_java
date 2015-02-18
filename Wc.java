import java.io.*;


public class Wc{
	private String str;
	private String fileName;

	public Wc(String str, String fileName){
		this.str = str;
		this.fileName = fileName;
	}

	public int getStringLength(String str){
		return str.length();
	}
		
	public int giveNumberOfWords(String str){
		String[] contantWords =  str.split("\\s+");
		int count = 0;
		for(int i = 0; i < contantWords.length; i++)
			if(contantWords[i].equals(""))
				count++;
		return contantWords.length - count;
	}

	public int giveNumberOfLines(String str){
		String[] contantChars = str.split("");
		int count = 0;
		for (int i = 0; i < contantChars.length; i++) {
			if(contantChars[i].equals("\n"))
				count++;
		}
		return count;
	}

	public String toString(){
		return "\t" + giveNumberOfLines(str) + "\t" + giveNumberOfWords(str) 
		+ "\t" + getStringLength(str) + " " + fileName;
	}
}

class WcJava{
	public static void main(String args[]) throws Exception { 
		FileReader readFile = new FileReader(args[0]); 
		BufferedReader breakLines = new BufferedReader(readFile); 
		String fileContent = ""; 
		String readLines;
		while((readLines = breakLines.readLine()) != null) { 
			fileContent += readLines + "\r\n";
		} 
		readFile.close();
		Wc w = new Wc(fileContent,args[0]);
		System.out.println(w);
	}
}