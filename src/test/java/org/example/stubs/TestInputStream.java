package org.example.stubs;

import java.io.IOException;
import java.io.InputStream;


public class TestInputStream extends InputStream {

    private final String messagetoResponse;

    public TestInputStream(String messagetoResponse){
        this.messagetoResponse = messagetoResponse;
    }


    @Override
    public int read() throws IOException {
        return 0;
    }

    public byte[] readAllBytes() throws IOException {
        return messagetoResponse.getBytes();
    }
}



