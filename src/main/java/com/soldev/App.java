package com.soldev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    static Path downloadedContentDir;
    
    public static void main( String[] args ) throws IOException
    {
        downloadedContentDir = Files.createTempDirectory("line-bot");
        SpringApplication.run(App.class, args);
    }
}
