package org.example.stubs;

import java.io.IOException;
import java.io.OutputStream;

public class TestOutputStream extends OutputStream {
    private String messageSent;


    @Override
    public void write(int b){

    }

    @Override
    public void write(byte[]b){
        messageSent = new String(b);
    }
    public String getMessageSent(){
        return messageSent;
    }

}
