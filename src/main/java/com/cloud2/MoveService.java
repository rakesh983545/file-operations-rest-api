package com.cloud2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoveService {
	
	@RequestMapping(value="/move")
	public String move() throws IOException
	{
		Path temp = Files.move
		        (Paths.get("D:\\fu\\a.txt"), 
		        Paths.get("D:\\co\\b.txt"));
		        

		        if(temp != null)
		        {
		            System.out.println("File renamed and moved successfully");
		        }
		        else
		        {
		            System.out.println("Failed to move the file");
		        }
		         return "file transfered successfully";
	}
	

}
