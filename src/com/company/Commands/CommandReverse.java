package com.company.Commands;

/**
 * Created by Brainacad4 on 26.03.2018.
 */
public class CommandReverse extends AbstractStringTransform {

    public CommandReverse(String data)
    {
        super(data);
    }
    @Override
    public String exec() {
        return new StringBuffer(this.data).reverse().toString();
    }
}
