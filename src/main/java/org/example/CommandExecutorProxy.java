package org.example;

public class CommandExecutorProxy implements CommandExecutorSubject {

    private boolean isAdmin;
    private final CommandExecutorSubject executor;

    public CommandExecutorProxy(String user, String pwd){
        if("abdul-majid".equals(user) && "123456".equals(pwd)) isAdmin=true;
        executor = new CommandExecutorRealSubject();
}

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else
            throw new Exception("Command is not allowed for non-admin users.");

        }

}
