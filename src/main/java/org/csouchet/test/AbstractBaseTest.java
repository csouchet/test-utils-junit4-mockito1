package org.csouchet.test;

import org.csouchet.test.rule.LogStatusTestWatcher;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestWatcher;

/**
 * @author Céline Souchet
 */
public abstract class AbstractBaseTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Rule
    public TestWatcher logRule = new LogStatusTestWatcher(getClass().getSimpleName());

}
