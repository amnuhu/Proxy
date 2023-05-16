package org.example;


public class ProxyPatternTest {

    public static void main(String[] args){
        CommandExecutorSubject executor = new CommandExecutorProxy("abdul-majid", "12345");
        try {
            executor.runCommand("notepad.exe");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }

}