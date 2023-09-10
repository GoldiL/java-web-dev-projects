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

    @Test
    public void testTriSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]][]"));
    }
    @Test
    public void testMultiSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch[]Code]][]"));
    }
    @Test
    public void bracketThatDontMatch() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch"));
    }
    @Test
    public void testMulSet() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[]Code"));
    }
    @Test
    public void testtiSet() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[]Code]][]"));
    }
    @Test
    public void tetiSet() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch]Code]]"));
    }

    @Test
    public void testOpenWithCloseFails() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode["));
    }
}