public static void printToFile(String filepath, ArrayList<Feild> list){
	PrintStream output = new Prinstream( new File(filepath));
	System.out.println("Do you want to create an Accessor? (y or n) >");
	//y
	createAccessor(output, list);
	//do you want to create mutator
	//mutator method
	//...
}