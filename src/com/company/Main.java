package com.company;
import java.util.Scanner;

import com.company.Commands.*;
import com.company.StringParser.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please input command: ");
        String result = "";
        while(true) {
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            IInputValidator validator = new InputValidator(userInput);
                ICommandParser parser = new CommandParser(userInput, validator);
                try
                {
                    parser.tryParse();
                    ICommandExec strTr = CommandFactory.Create(
                            parser.getCommand()
                            ,parser.getData());
                    result = strTr.exec();
                    System.out.println(parser.getCommand() + ": " + result);
                }
                catch (ValidationException e)
                {
                    System.out.println("Validation error: "
                            + e.getValidationErrorInfo());
                }
                catch (UnsupportedOperationException e)
                {
                    System.out.println(parser.getCommand()
                            + ":error, unsupported command.");
                }
                if (CommandNames.Exit.equals(parser.getCommand()))
                {
                    break;
                }
            }
    }
}



