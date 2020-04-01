/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Test;

/**
 *
 * @author patel
 */
public class Ice4Test {
    
    public Ice4Test() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of main method, of class Ice4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ice4.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxOccuringChar method, of class Ice4.
     */
    @Test
    public void testGetMaxOccuringChar() {
        System.out.println("getMaxOccuringChar");
        String str = "";
        char expResult = ' ';
        char result = Ice4.getMaxOccuringChar(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAscii method, of class Ice4.
     */
    @Test
    public void testCheckAscii() {
        System.out.println("checkAscii");
        String name = "";
        String expResult = "";
        String result = Ice4.checkAscii(name);
        assertEquals(expResult, result, null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkWord method, of class Ice4.
     */
    @Test
    public void testCheckWord() {
        System.out.println("checkWord");
        char ch = ' ';
        Object par1 = null;
        Ice4 instance = new Ice4();
        instance.checkWord(ch, par1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(char expResult, char result, Object par2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(String expResult, String result, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
