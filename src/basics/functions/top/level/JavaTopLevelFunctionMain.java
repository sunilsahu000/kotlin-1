package basics.functions.top.level;


import sample.main.kotlin.examples.top.level.function.TopLevelFile;

public class JavaTopLevelFunctionMain {

    public static void main(String args[]){
        String textFromTopLevelFunction = TopLevelFile.topLevelFunction();
        System.out.println("Text from top level function: " + textFromTopLevelFunction);
    }
}
