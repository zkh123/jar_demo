package com.jar;

import org.apache.commons.cli.*;

/**
 * Created by huanglijun on 2018/8/30.
 */
public class Main {
    private static CommandLine getOptions(String[] args) {
        Options options = new Options();

        Option filepath = new Option("cfp", "filepath", true, "input csv file path");
        filepath.setRequired(true);
        options.addOption(filepath);

        Option logFilePath = new Option("lfp", "logFilePath", true, "log file path");
        logFilePath.setRequired(true);
        options.addOption(logFilePath);

        Option currentDate = new Option("cd", "currentDate", true, "current date");
        currentDate.setRequired(true);
        options.addOption(currentDate);

        Option creditLimitDate = new Option("cld", "creditLimitDate", true, "creditLimit date");
        creditLimitDate.setRequired(true);
        options.addOption(creditLimitDate);

        Option threadNum01 = new Option("tn1", "threadNum01", true, "threadPool01");
        logFilePath.setRequired(true);
        options.addOption(threadNum01);

        Option threadNum02 = new Option("tn2", "threadNum02", true, "threadPool02");
        logFilePath.setRequired(true);
        options.addOption(threadNum02);


        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("java ", options);
            System.exit(1);
        }
        return cmd;
    }

    /**
     * java -jar jar-1.0-SNAPSHOT.jar 123 ssm 上海 233 yyyyy
     * @param args
     */
    public static void main(String[] args){
        CommandLine commandLine = getOptions(args);
        System.out.println(commandLine.getOptionValue("filepath"));
        System.out.println(commandLine.getOptionValue("logFilePath"));
        System.out.println(commandLine.getOptionValue("currentDate"));
        System.out.println(commandLine.getOptionValue("creditLimitDate"));
        System.out.println(commandLine.getOptionValue("threadNum01"));
        System.out.println(commandLine.getOptionValue("threadNum02"));
    }
}
