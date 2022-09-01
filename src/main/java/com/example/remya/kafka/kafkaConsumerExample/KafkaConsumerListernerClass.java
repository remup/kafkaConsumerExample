package com.example.remya.kafka.kafkaConsumerExample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaConsumerListernerClass {
	@KafkaListener(topics = "TestTopic", groupId = "group_stringType",
            containerFactory = "kafkaListenerContainerFactory")
	
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
	
	@KafkaListener(topics = "EmployeeTopic", groupId = "group_jsonEmployee",
            containerFactory = "employeeKafkaListenerFactory")
    
    public void consumeJson(Employee emp) {
        System.out.println("Consumed JSON Message: " + emp);
    }


}
