package org.andrei.app;

import java.io.File;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    private String membru;
    private static String membruStatic;
    private Random random;

    {System.out.println("Instance"); init();}
    static {System.out.println("Class is being initialized"); initCurrentPath();}

    public static void main( String[] args )
    {
        App app = new App();
    }

    public App(){

        membru = membruStatic + File.pathSeparator + random.nextInt(1000);
    }

    public static void initCurrentPath(){
        membruStatic = System.getProperty("user.dir");

    }

    public void init(){
        initCurrentPath();
        random = new Random();
    }
}
