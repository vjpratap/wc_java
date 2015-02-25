public class Wc{
	private String str;
	private String fileName;
	private String[] options;

	public Wc(String str, String fileName,String[] options){
		this.str = str;
		this.fileName = fileName;
		this.options = options;
	}

	public String giveMaximumLineInString(){
		String[] devideByLines = str.split("\r\n");
		String max = devideByLines[0];
		for(String line:devideByLines)
			if(line.length() > max.length())
				max = line;
		return (max.length() + 1) + " " + max;
	}

	public String giveManimunLineInString(){
		String[] devideByLines = str.split("\r\n");
		String max = devideByLines[0];
		for(String line:devideByLines)
			if(line.length() < max.length())
				max = line;
		return (max.length() + 1) + " " + max;
	}

	public String getStringLength(){
		return str.length() + "";
	}
		
	public String giveNumberOfWords() {
		String[] contantWords =  str.split("\\s+");
		int count = 0;
		for(String word : contantWords)
			if(word.equals(""))
				count++;
		return contantWords.length - count + "";
	}

	public String giveNumberOfLines(){
		return str.split("\n").length + "";
	}

	public int giveIndex(String flag){
		String[] allOptions = {"-l","-w","-c","-L", "-S"};
		for (int i = 0;i < allOptions.length; i++) {
			if(allOptions[i].substring(0,2).equals(flag))
				return i;
		}
		return -1;
	}

	private String giveFlagsString(){
		String[] contantFunction = {giveNumberOfLines(),giveNumberOfWords(),getStringLength(),
									giveMaximumLineInString(), giveManimunLineInString()};
		String flagsValue = "";

		for(String flag : options){
			flagsValue += "\t" + contantFunction[giveIndex(flag)];
		}
		return flagsValue;
	}

	public String toString(){
		// String[] contantFunction = {giveNumberOfLines(),giveNumberOfWords(),getStringLength(),
		// 							giveMaximumLineInString(), giveManimunLineInString()};

		if(options.length == 0){
			return "\t" + giveNumberOfLines() + "\t" + giveNumberOfWords() 
				+ "\t" + getStringLength() + " " + fileName;
		}
		if(giveIndex(options[0]) == -1)
			return "invalid option " + options[0].substring(1,2);
		return giveFlagsString() + " " +fileName;
	}
}

// class WcJava{
// 	public static String readFileContent(String file) throws Exception {
// 		try{	
// 			FileReader readFile = new FileReader(file); 
// 			BufferedReader breakLines = new BufferedReader(readFile); 
// 			String fileContent = ""; 
// 			String readLines;
// 			while((readLines = breakLines.readLine()) != null) { 
// 				fileContent += readLines + "\r\n";
// 			} 
// 			readFile.close();
// 			return fileContent;
// 		}catch(Exception e){
// 			return null;
// 		}
// 	}

// 	public static void main(String args[]) throws Exception {
// 		String fileContent = readFileContent(args[0]);
// 		String options = "";
// 		options = args.length == 1 ? null : args[1];
// 		if(fileContent == null)
// 			System.out.println("invalid file");
// 		else{
// 			Wc w = new Wc(fileContent,args[0],options);
// 			System.out.println(w);
// 		} 
// 	}
// }