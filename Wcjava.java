import java.io.*;

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
		OptionHandler h = new OptionHandler(args);
		String[] files = h.giveFileNames();
		String fileContent = readFileContent(files[0]);
		String[] options = h.giveFlags();
		if(fileContent == null)
			System.out.println("invalid file");
		else{
			Wc w = new Wc(fileContent,files[0],options);
			System.out.println(w);
		} 
	}
}