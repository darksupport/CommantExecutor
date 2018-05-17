package com.company.StringParser;

import com.sun.deploy.util.StringUtils;
import com.sun.istack.internal.NotNull;

/**
 * Created by Brainacad4 on 29.03.2018.
 */
public class CommandParser implements  ICommandParser{

    private String data;
    private String command;
    private String userInput;
    private IInputValidator validator;
    private static String separator = " ";
    public  CommandParser(String userInput, IInputValidator validator)
    {
        this.userInput = userInput;
        this.validator = validator;
        this.data = "";
        this.command = "";
    }

    @Override
    public boolean tryParse() throws ValidationException {
                validator.validate();
                String[] stringArray = userInput.split(separator);
                this.command = new String(stringArray[0]);
                if (stringArray.length > 1) {
                    this.data = new String(stringArray[1]);
                }
                return  true;
    }

    @Override
    public String getCommand() {
        return this.command;
    }

    @Override
    public String getData() {
        return this.data;
    }
}
