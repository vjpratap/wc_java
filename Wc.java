import java.io.*;

public class Wc{
	private String str;
	private String fileName;
	private String options;

	public Wc(String str, String fileName,String options){
		this.str = str;
		this.fileName = fileName;
		this.options = options;
	}

	public int getStringLength(){
		return str.length();
	}
		
	public int giveNumberOfWords() {
		return str.split("[ \t\n]").length;
	}

	public int giveNumberOfLines(){
		return str.split("\n").length;
	}

	public int giveIndex(){
		String[] allOptions = {"-l","-w","-c"};
		for (int i = 0;i < allOptions.length; i++) {
			if(allOptions[i].substring(0,2).equals(options))
				return i;
		}
		return -1;
	}

	public String toString(){
		int[] contantFunction = {giveNumberOfLines(),giveNumberOfWords(),getStringLength()};
		if(options == null){
			return "\t" + giveNumberOfLines() + "\t" + giveNumberOfWords() 
				+ "\t" + getStringLength() + " " + fileName;
		}
		if(giveIndex() == -1)
			return "invalid option " + options.substring(1,2);
		return "\t" + contantFunction[giveIndex()] + " " +fileName;
	}
}

class WcJava{
	public static String readFileContent(String file) throws Exception {
		try{	
			FileReader readFile = new FileReader(file); 
			BufferedReader breakLines = new BufferedReader(readFile); 
			String fileContent = ""; 
			String readLines;
			while((readLines = breakLines.readLine()) != null) { 
				fileContent += readLines + "\r\n";
			} 
			readFile.close();
			return fileContent;
		}catch(Exception e){
			return null;
		}
	}

	public static void main(String args[]) throws Exception {
		String fileContent = readFileContent(args[0]);
		String options = "";
		options = args.length == 1 ? null : args[1];
		if(fileContent == null)
			System.out.println("invalid file");
		else{
			Wc w = new Wc(fileContent,args[0],options);
			System.out.println(w);
		} 
	}
}