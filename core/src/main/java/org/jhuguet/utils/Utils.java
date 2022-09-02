package org.jhuguet.utils;

import demo.StringUtils;

public class Utils {

    public boolean isAllPositiveNumbers(String ...parameters){

        StringUtils utils = new StringUtils();

        for(String param : parameters){
            if(!utils.isPositiveNumber(param)) return false;
        }
        return true;
    }
}
