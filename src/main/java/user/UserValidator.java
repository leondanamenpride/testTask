package user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import user.model.User;
import user.service.UserService;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass) ;
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        //User validation by name
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Required");

        if(user.getUserName().length()<6 || user.getUserName().length() > 20 ){
            errors.rejectValue("username", "Size.username");
        }

        if(userService.findByUsername(user.getUserName())!= null){
            errors.rejectValue("username", "Exist.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");

        if(user.getUserPassword().length()<6 || user.getUserPassword().length() > 20 ){
            errors.rejectValue("password", "Size.password");
        }
    }
}
