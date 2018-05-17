package com.company.Commands;

/**
 * Created by Brainacad4 on 26.03.2018.
 */
public abstract class AbstractStringTransform implements ICommandExec {

    String data;
    public AbstractStringTransform(String data)
    {
        this.data = data;
    }

    public abstract String exec();
}
