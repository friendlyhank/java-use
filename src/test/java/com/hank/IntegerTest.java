package com.hank;

import org.junit.Test;

public class IntegerTest {
        //string to int
        @Test
        public void parseIntTest(){
            String p = "9999";
            int port = Integer.parseInt(p);
            System.out.println(port);
        }
}
