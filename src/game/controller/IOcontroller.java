package game.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;



public class IOcontroller
{
	public static void saveTextToFile(Controller app, String path, String text)
	{
		String filename = buildDataBasedFilename(path);
		
		try (Scanner textScanner = new Scanner(text);
				PrintWriter textWriter = new PrintWriter(filename))
		{
			while (textScanner.hasNextLine())
			{
				String line = textScanner.nextLine();
				textWriter.println(line);
			}
		}
		catch (IOException error)
		{
			app.handleError(error);
		}
	}
	
	
	
	public static String buildDataBasedFilename(String path)
	{
		String filename = path + "Data Structures Info ";
		LocalDateTime currentTime = LocalDateTime.now();
		
		filename += currentTime.getMonth() + " " + currentTime.getDayOfMonth();
		int minuteTime = currentTime.getMinute();
		String minutes = "0";
		
		if (minuteTime < 10)
		{
			minutes += minuteTime;
		}
		else
		{
			minutes = "" + minuteTime;
		}
		
		filename += " " + currentTime.getHour() + "-" + minutes + ".txt";
		
		return filename;
	}
}
