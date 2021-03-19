package container;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ContainerSuite extends TestCase {

    public ContainerSuite(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("ContainerSuite");
        suite.addTest(container.MainTest.suite());
        suite.addTest(container.PackageTest.suite());
        suite.addTest(container.ContainerTest.suite());
        suite.addTest(container.WarehouseTest.suite());
        return suite;
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
