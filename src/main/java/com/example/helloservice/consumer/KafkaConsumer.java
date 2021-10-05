package com.example.helloservice.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topicPattern = "greeting-topic", concurrency = "1", groupId = "message_processing", 
			properties = {
			"enable.auto.commit=true", "max.poll.interval.ms=86400000" })
	public void consume(ConsumerRecord<String, String> record) {
		System.out.println("inside the Hello Consumer");
		System.out.println(record);
			String content = (String) record.value();
			System.out.println(content);

	}
}
