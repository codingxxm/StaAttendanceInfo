package com.xxm;

import org.apache.commons.lang3.StringUtils;

public class Main {

    static ConfigUtils configUtils;

    public static void main(String[] args) {
        try {
            if(args.length<1 || StringUtils.isBlank(args[0])){
                throw new RuntimeException("illegal argements : args is null");
            }
            configUtils = new ConfigUtils(args[0]);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
