package org.csouchet.test;

import org.csouchet.test.rule.MockitoRule;
import org.junit.Rule;
import org.junit.rules.TestRule;

/**
 * @author Céline Souchet
 */
public abstract class AbstractMockitoTest extends AbstractBaseTest {

    @Rule
    public TestRule mockRule = new MockitoRule(this);

}
