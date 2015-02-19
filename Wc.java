import java.io.*;

public class Wc{
	private String str;
	private String fileName;

	public Wc(String str, String fileName){
		this.str = str;
		this.fileName = fileName;
	}

	public int getStringLength(){
		return str.length();
	}
		
	public int giveNumberOfWords(){
		String[] contantWords =  str.split("\\s+");
		int count = 0;
		for(int i = 0; i < contantWords.length; i++)
			if(contantWords[i].equals(""))
				count++;
		return contantWords.length - count;
	}

	public int giveNumberOfLines(){
		String[] contantChars = str.split("");
		int count = 0;
		for (int i = 0; i < contantChars.length; i++) {
			if(contantChars[i].equals("\n"))
				count++;
		}
		return count;
	}

	public String toString(){
		return "\t" + giveNumberOfLines() + "\t" + giveNumberOfWords() 
		+ "\t" + getStringLength() + " " + fileName;
	}
}

class WcJava{
	public static String readFileContent(String file) throws Exception {
		FileReader readFile = new FileReader(file); 
		BufferedReader breakLines = new BufferedReader(readFile); 
		String fileContent = ""; 
		String readLines;
		while((readLines = breakLines.readLine()) != null) { 
			fileContent += readLines + "\r\n";
		} 
		readFile.close();
		return fileContent;
	}

	// public String[] allOption(String args[]){
	// 	String[] options = new String[args.length];
	// 	int count = 0;
	// 	for (int i = 0;i < args.length; i++) {
	// 		if(args[i].substring(0,1).equals("-"))
	// 			options[count++] = args[i];
	// 	}
	// 	return options;
	// }

	public static void main(String args[]) throws Exception {
		String fileContent = readFileContent(args[0]);
		Wc w = new Wc(fileContent,args[0]);
		System.out.println(w);
	}
}