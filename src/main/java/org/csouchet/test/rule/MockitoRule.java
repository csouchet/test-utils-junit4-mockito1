package org.csouchet.test.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.mockito.MockitoAnnotations;

/**
 * @author Céline Souchet
 */
public class MockitoRule implements TestRule {

    private final Object target;

    public MockitoRule(final Object target) {
        this.target = target;
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {
                MockitoAnnotations.initMocks(target);
                base.evaluate();
            }
        };
    }

}
