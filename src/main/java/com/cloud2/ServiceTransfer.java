package com.cloud2;

import java.io.*;
import java.nio.file.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ServiceTransfer {
	
	@RequestMapping(value="/copy")
	public String movefile() throws IOException
	{
		Path temp = Files.copy
		        (Paths.get("D:\\fu\\a.txt"), 
		        Paths.get("D:\\co\\b.txt"));
	
		        if(temp != null)
		        {
		            System.out.println("File copied successfully");
		        }
		        else
		        {
		            System.out.println("Failed to copy the file");
		        }
		         return "file transfered successfully";
	}

}
