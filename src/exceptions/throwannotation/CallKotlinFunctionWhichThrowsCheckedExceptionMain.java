package exceptions.throwannotation;

import java.io.IOException;


public class CallKotlinFunctionWhichThrowsCheckedExceptionMain {

    public static void main(String args[]){
    try {
        TopLevelFunctionThrowingIOException.throwIOException();
    }catch (IOException exception) {
        System.out.println("IOException thrown from Kotlin function");
    }

    }

}
