package org.csouchet.test.rule;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Céline Souchet
 */
public class LogStatusTestWatcher extends TestWatcher {

    private final Logger logger;

    public LogStatusTestWatcher(final String loggerName) {
        logger = LoggerFactory.getLogger(loggerName);
    }

    @Override
    protected void starting(final Description description) {
        logger.warn("Starting test: " + description.getClassName() + "." + description.getMethodName());
    }

    @Override
    protected void succeeded(final Description description) {
        logger.warn("Succeeded test: " + description.getClassName() + "." + description.getMethodName());
    }

    @Override
    protected void failed(final Throwable e, final Description description) {
        logger.error("Failed test: " + description.getClassName() + "." + description.getMethodName(), e);
    }

    @Override
    protected void finished(final Description description) {
        logger.warn("-----------------------------------------------------------------------------------------------");
    }

}
