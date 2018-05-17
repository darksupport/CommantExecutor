package com.company.Commands;

import java.util.HashMap;

/**
 * Created by Brainacad4 on 26.03.2018.
 */
public class CommandFactory {

    static HashMap<String,Integer> countExecution
            = new HashMap<String, Integer>();

    static
    {
        countExecution.put(CommandNames.Reverse,0);
        countExecution.put(CommandNames.Replace,0);
        countExecution.put(CommandNames.Remove,0);
    }

    static  void incrimentCounter(String type)
    {
        if (countExecution.containsKey(type))
        {
            countExecution.put(type, countExecution.get(type) +1);
        }
    }

    static void RegisterConstructor()
    {

    }

    public  static int getCountExec(String type)
    {
        return countExecution.get(type).intValue();
    }

    public static ICommandExec Create(String type, String data) throws UnsupportedOperationException
    {
        incrimentCounter(type);
        if (CommandNames.Reverse.equals(type))
        {
            return new CommandReverse(data);
        }
        if (CommandNames.Replace.equals(type))
        {
            return new CommandReplace(data);
        }
        if (CommandNames.Remove.equals(type))
        {
            return  new CommandRemove(data);
        }
        if (CommandNames.Exit.equals(type))
        {
            return  new CommandExit(countExecution);
        }
        throw new UnsupportedOperationException();
    }
}
