package com.saransh.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		
		
		Path pathFileToWrite = Paths.get("./resources/written_file.txt");
		List<String> lines=List.of("Apple","Boy","Cat","Dog","Elephant");
		
		Files.write(pathFileToWrite,lines);
	}

}
