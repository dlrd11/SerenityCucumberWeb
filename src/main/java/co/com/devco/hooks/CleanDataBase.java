package co.com.devco.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CleanDataBase {

    @Before
    public static void beforeHook(){
        System.out.println("before hook");
    }

    @After
    public static void afetHook(){
        System.out.println("after hook");
    }
}
