package academy.learnprogramming.config.util;

import academy.learnprogramming.config.model.TodoData;
import org.springframework.web.bind.annotation.ModelAttribute;

public final class Mappings {

    // == constants ==
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }


    // == constructors ==
    private Mappings() {} // not reason to extend this class ever
    // no reason to instantiate this class


}
