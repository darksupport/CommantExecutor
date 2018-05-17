package com.company.StringParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Brainacad4 on 29.03.2018.
 */
public class InputValidator implements IInputValidator {

    private  String data;
    public InputValidator(String data)
    {
        this.data = data;
    }
    @Override
    public boolean validate() throws ValidationException
    {
        checkInputFormat();
        return true;
    }

    private void checkInputFormat() throws ValidationException
    {
        Pattern pattern = Pattern.compile("exit|(\\w+ \\w*)");
        Matcher matcher = pattern.matcher(this.data);
        if (!matcher.matches()) {
            throw new  ValidationException(
                    "Not matches with comand input pattern");
        }
    }
}
