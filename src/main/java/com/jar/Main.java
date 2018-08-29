package com.jar;

/**
 * Created by huanglijun on 2018/8/30.
 */
public class Main {

    /**
     * java -jar jar-1.0-SNAPSHOT.jar 123 ssm 上海 233 yyyyy
     * @param args
     */
    public static void main(String[] args){
        for (int i = 0 ; i < args.length; i ++){
            System.out.println(args[i]);
        }
    }
}
