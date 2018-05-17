package com.company.Commands;

/**
 * Created by Brainacad4 on 26.03.2018.
 */
public class CommandReplace extends AbstractStringTransform {

    public CommandReplace(String data)
    {
        super(data);
    }
    @Override
    public String exec() {
        return this.data.replace("_","");
    }
}
