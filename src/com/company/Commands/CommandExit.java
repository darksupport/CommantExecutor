package com.company.Commands;

import java.util.HashMap;

/**
 * Created by Brainacad4 on 29.03.2018.
 */
public class CommandExit implements ICommandExec {

    HashMap<String,Integer> executinInfo;
    public CommandExit(HashMap<String,Integer> executinInfo)
    {
        this.executinInfo = executinInfo;
    }

    @Override
    public String exec() {
       return  CommandNames.Reverse + ": "
               + this.executinInfo.get(CommandNames.Reverse)
               +CommandNames.Remove +": "
               + this.executinInfo.get(CommandNames.Remove)
               + CommandNames.Replace +": "
               + this.executinInfo.get(CommandNames.Replace);
    }
}
