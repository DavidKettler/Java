	import java.io.*;
//imports all of the java.io packets

public class FileArray {
	//un-used constructor
	public FileArray() {
		
	}
	//WriteArray Method that passes the name and an array as an argument and throws an IOException
	public static void WriteArray(String Name, int[] Array) throws IOException {
		//opens the FileOutputStream and DataOutputStream objects
		FileOutputStream fstream = new FileOutputStream(Name + ".dat");
		DataOutputStream OutputFile = new DataOutputStream(fstream);
		System.out.println("Writing to File...");
		//writes to file
		for (int i = 0; i < Array.length; i++) {
			OutputFile.writeInt(Array[i]);
		}
		//closes the objects
		fstream.close();
		OutputFile.close();
		System.out.println("Done...");
	}
	//ReadArray Method that passes the name and an array as an argument and throws an IOException
	public static int[] readArray(String Name, int[] Array) throws IOException {
		//Creates an array to store the numbers from the file in
		int[] Array2 = new int[Array.length];
		//opens the FileInputStream and DataInputStream objects to read the data from the file
		FileInputStream fstream = new FileInputStream(Name + ".dat");
		DataInputStream inputFile = new DataInputStream(fstream);
		int number;
		System.out.println("Reading from the file...");
		try{
			for(int i = 0; i < Array.length; i++){
				try {
					//converts the numbers to an int and stores it in the array
					number = inputFile.readInt();
					Array2[i] = number;				
				} catch (EOFException e) {
					//if there is no numbers it prints this error and breaks out of the loop
					System.out.println("Error: end of file");
					break;
				}
				
			}
		}catch(Exception e){
			//prints the caught exception error message
			System.out.println(e.getMessage());
		}finally{
			//closses the objects no matter if it throws an exeption
			fstream.close();
			inputFile.close();
			System.out.println("Done...");
		}
		//returns the array from the file to the launcher class
		return Array2;
	}
}
