package org.example;

import java.io.IOException;

public class CommandExecutorRealSubject implements CommandExecutorSubject {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}