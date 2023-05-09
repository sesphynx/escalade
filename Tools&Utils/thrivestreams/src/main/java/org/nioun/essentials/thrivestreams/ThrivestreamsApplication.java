package org.nioun.essentials.thrivestreams;

import java.util.Arrays;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableKafkaStreams
public class ThrivestreamsApplication {
	
	@Bean
	NewTopic quotes(){
		return new NewTopic("quotes", 6, (short)3);
	}
	
	@Bean
	NewTopic counts(){
		return new NewTopic("counts", 6, (short)3);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ThrivestreamsApplication.class, args);
	}

}

@Component
class Processor {
	
	final Serde<String> stringSerde=Serdes.String();
	
	@Autowired
	public void process(final StreamsBuilder builder){
		
	builder.stream("quotes", Consumed.with(stringSerde, stringSerde))
		   .flatMapValues( value -> Arrays.asList( value.toLowerCase().split("\\W+")))
		   .groupBy(((key,value) -> value))
		   .count().
		   toStream().
		   to("counts");
	
		// read data , quotes from a source
		// count characters
		//write them to a result topic 
		
		
	}
	
}