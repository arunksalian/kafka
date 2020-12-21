package com.slin.app.demo.consumer;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class SimpleConsumer {

	/*
	 * @KafkaListener(topics = "myFirst") public void consume(ConsumerRecord<String,
	 * String> record) throws IOException {
	 * 
	 * System.out.println(record.topic()+", val:"+record.value()+", message:"+record
	 * .key()+",  "); }
	 */
	
	@KafkaListener(topics = "myFirst")
    public void consume(@Payload String message, ConsumerRecord<String,
    		 String> record) throws IOException {
		
       System.out.println("===>"+message);
    }
}
