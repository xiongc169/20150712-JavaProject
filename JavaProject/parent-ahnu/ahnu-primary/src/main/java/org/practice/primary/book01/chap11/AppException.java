package org.practice.primary.book01.chap11;

import org.apache.http.MethodNotSupportedException;

import javax.xml.ws.http.HTTPException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileSystemException;
import java.util.logging.Logger;

/**
 * @Desc 《Java核心技术·卷1》第十一章、异常、断言、日志、调试
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018年8月20日
 * <p>
 * @Version 1.0
 */
public class AppException {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        try {
            category1101();
            log1105();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("This is finally");
        }
    }

    private static void category1101() {
        //Throwable
        Throwable throwable = new Throwable();
        throwable.printStackTrace();

        //Error：描述了Java运行时系统的内部错误和资源耗尽错误
        Error error = new Error();
        VirtualMachineError virtualMachineError = null;
        OutOfMemoryError outOfMemoryError = null;
        //NoSuchClassError noSuchClassError = null;
        NoSuchFieldError noSuchFieldError = null;
        NoSuchMethodError noSuchMethodError = null;

        //RuntimeException：由于程序错误导致的异常，属于RuntimeException。
        RuntimeException runtimeException = new RuntimeException();
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        NullPointerException nullPointerException = null;

        HTTPException httpException = null;

        //其他异常(非运行时异常)：程序本身没有问题，由于像IO错误导致的异常
        Exception exception = new Exception();
        IOException ioException = null;
        FileNotFoundException fileNotFoundException = null;
        FileSystemException fileSystemException = null;
        AccessDeniedException accessDeniedException = null;
        ClassNotFoundException classNotFoundException = null;
        MethodNotSupportedException methodNotSupportedException = null;


        //派生于Error、RuntimeException类的所有异常，称为未检查异常(unchecked exception)
        //其他的异常，称为已检查异常(checked exception)
    }

    private static void log1105() {
        Logger logger = Logger.getLogger("");
        logger.info("This is info");
    }

    /**
     * 《Spring揭秘》chap 11.1.1、Java异常处理
     * unchecked exception：包括java.lang.Error、java.lang.RuntimeException及其子类；因为编译器不会对这些类型的异常进行编译期检查。
     */
    private void uncheckException() {
        myError();
        myRuntimeException();
    }

    /**
     * 《Spring揭秘》chap 11.1.1、Java异常处理
     * checked exception：包括java.lang.Exception及其子类(除去RuntimeException及其子类)；方法定义中声明了将会抛出checked exception，调用程序就必需进行处理。
     */
    private void checkException() throws Throwable {
        myThrowable();
        myFileNotFoundException();
    }

    private void myError() throws Error {
    }

    private void myRuntimeException() throws RuntimeException {
    }

    private void myThrowable() throws Throwable {
    }

    private void myFileNotFoundException() throws FileNotFoundException {
    }
}
