package exceptions.validator;

import exceptions.exception.ValidatorException;
import exceptions.model.UserModel;

public class UserValidator {

    private UserValidator(){

    }

    public static void VerifyModel(final UserModel model) throws ValidatorException{
        if(StringIsBlank(model.getName()))
        if(model.getName() == null|| model.getName().isEmpty()) 
            throw new ValidatorException("Enter a valid user");
        if(model.getName().length() <=1)
            throw new ValidatorException("The name must have more than one character.");
        if(!model.getEmail().contains("@")&& (!model.getEmail().contains(".")))
            throw new ValidatorException("Enter a valid email address.");
    }

    private static boolean StringIsBlank(final String value){
        return value == null || value.isBlank();
    }
}
