package com.validator;

import com.vaadin.data.Validator;

/**
 * Created by zhouchunjie on 16/1/6.
 * 自定义校验器
 */
public class MyValidator implements Validator {
    @Override
    public void validate(Object o) throws InvalidValueException {
        if (!(o instanceof String && ((String) o).equals("hello"))) {
            throw new InvalidValueException("You need write 'hello'!");
        }
    }
}
