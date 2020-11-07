package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import org.example.stubs.*;

import static org.junit.jupiter.api.Assertions.*;

class EchoServiceTest {

    @Test
    public void givenValidRequestAnResponse_WhenEcho_ThenTrueIsResponded() throws IOException {
        //Given
        EchoService echoService = new EchoService();

        String ip = "";
        int port = 3000;
        String request = "11001";

        TestOutputStream outputStream = new TestOutputStream();
        TestInputStream inputStream = new TestInputStream(request);

        //When
        boolean response = echoService.sendEchoMessage(request,outputStream,inputStream);

        //Then
        String messageSent = outputStream.getMessageSent();
        assertEquals(request,messageSent);
        assertTrue(response);

    }

    @Test
    public void givenValidRequestAnWrongResponse_WhenEcho_ThenFalseIsResponded() throws IOException {
        //Given
        EchoService echoService = new EchoService();

        String request = "fgdgfd";

        TestOutputStream outputStream = new TestOutputStream();
        TestInputStream inputStream = new TestInputStream("Hello WOrld!");

        //When
        boolean response = echoService.sendEchoMessage(request,outputStream,inputStream);

        //Then
        String messageSent = outputStream.getMessageSent();
        assertEquals(request,messageSent);
        assertFalse(response);

    }
}