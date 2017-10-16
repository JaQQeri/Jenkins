/*
	Jani Lamppu
	Jenkins test Java app
	16th October 2017
*/

import java.io.*;

public class jenkinsCode
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Log writer executed!");
		PrintWriter writer = new PrintWriter("logfile.txt", "UTF-8");	
		writer.println("Log entry from Log writer!");
		writer.close();
	}
}