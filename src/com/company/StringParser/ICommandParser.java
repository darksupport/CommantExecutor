package com.company.StringParser;

/**
 * Created by Brainacad4 on 29.03.2018.
 */
public interface ICommandParser {
    boolean tryParse() throws ValidationException;
    String getCommand();
    String getData();
}
