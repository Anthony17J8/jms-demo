package com.ico.ltd.jms.listener;

import com.ico.ltd.jms.config.JmsConfig;
import com.ico.ltd.jms.model.HelloMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class MessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloMessage helloMessage,
                       MessageHeaders headers, Message message) {
        System.out.println("I got a message!");

        System.out.println(helloMessage);
    }
}
