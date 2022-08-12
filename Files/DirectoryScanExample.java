package com.saransh.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanExample {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Files in current dir: ");
		Path currentDirectory = Paths.get(".");
		Files.list(currentDirectory).forEach(System.out::println); //Files present in current directory
		
		System.out.println("\nDisplaying Files recursively in current dir: ");
		Files.walk(currentDirectory, 4).forEach(System.out::println);
		
		System.out.println("\nDisplaying all .java files recursively in current dir: ");
		
		Predicate<? super Path> predicate=path->String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);
		
		System.out.println("\nDisplaying all .java files using \"find\"\n recursively in current dir: ");
		BiPredicate<Path, BasicFileAttributes> javaMatcher=(path,attributes)->String.valueOf(path).contains(".java");
		Files.find(currentDirectory, 4,javaMatcher).forEach(System.out::println);
		
		System.out.println("\nDisplaying all the directories recursively: ");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher=(path,attributes)->attributes.isDirectory();
		Files.find(currentDirectory, 4,directoryMatcher).forEach(System.out::println);
	}

}
