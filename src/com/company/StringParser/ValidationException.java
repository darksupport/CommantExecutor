package com.company.StringParser;

/**
 * Created by Brainacad4 on 02.04.2018.
 */
public class ValidationException extends Exception {
    private  String validationErrorInfo;

    public ValidationException(String info)
    {
        super();
        this.validationErrorInfo = info;
    }

    public String getValidationErrorInfo()
    {
        return this.validationErrorInfo;
    }
}
