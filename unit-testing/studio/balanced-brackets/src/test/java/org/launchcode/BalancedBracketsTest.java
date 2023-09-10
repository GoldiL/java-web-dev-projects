package org.launchcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBracketsTest {
    //TODO: add tests here


    @Test
    public void testSigngleSet() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void testDoubleSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    public void testTriSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]][]"));
    }
    public void testMultiSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch[]Code]][]"));
    }

    @Test
    public void testOpenWithCloseFails() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }
}