package com.cm.MutilThread.Chapter01.t4_threadsafe;

/**
 * @author chengawu
 * @date 1/11/2019 5:35 PM
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
