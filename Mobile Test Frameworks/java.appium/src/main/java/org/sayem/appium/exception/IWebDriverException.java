package org.sayem.appium.exception;

public class IWebDriverException extends Exception {
    public IWebDriverException(String msg) {
        super(msg);
    }

    public IWebDriverException(String msg, Exception e) {
        super(msg, e);
    }
}
