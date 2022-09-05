package com.lalkg.kafka;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message{
	
	public String message;
	public LocalDateTime created;
	
}
