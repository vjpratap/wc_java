class OptionHandler{
	private String[] arguments;

	public OptionHandler(String[] arguments){
		this.arguments = arguments;
	}

	public int giveLength(){
		int count = 0;
		for (String argument : arguments) {
			if(argument.substring(0,1).equals("-"))
				count++;
		}
		return count;
	}

	public String[] giveFileNames(){
		int length = arguments.length - giveLength(), count = 0;
		String[] files = new String[length];
		for(String argument : arguments){
			if(!argument.substring(0,1).equals("-"))
				files[count++] = argument;
		}
		return files;
	}

	public String[] giveFlags(){
		String[] flags = new String[giveLength()];
		int count = 0;
		for(String argument : arguments){
			if(argument.substring(0,1).equals("-"))
				flags[count++] = argument;
		}	
		return flags;
	}
}