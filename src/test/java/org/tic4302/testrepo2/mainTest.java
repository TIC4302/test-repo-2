package org.tic4302.testrepo2;

import org.junit.Assert;
import org.junit.Test;

public class mainTest {
    @Test
    public void testGreeting() throws Exception {
        main mainClass = new main();
        String expectedGreeting = mainClass.getGreetingString();
        Assert.assertEquals("Hi Aris!", expectedGreeting);
    }

}