package com.cts.training.userservice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes=UserServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class IntegrationTesting {
	
	
	
	@LocalServerPort
	private int port;
	HttpHeaders headers = new HttpHeaders();
	TestRestTemplate restTemplate=new TestRestTemplate();
	@Test
	public void test() {
		String url="http://localhost:"+port+"/registerUser";
		System.out.println("Port : :"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(null,headers);
		ResponseEntity<String> response= restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\r\n" + 
				"        \"id\": 63,\r\n" + 
				"        \"username\": \"Ajax\",\r\n" + 
				"        \"password1\": \"werewr\",\r\n" + 
				"        \"password2\": \"wrwrewrw\",\r\n" + 
				"        \"email\": \"babymol.bobby@gmail.com\",\r\n" + 
				"        \"phone\": 567890,\r\n" + 
				"        \"enabled\": true\r\n" + 
				"    }";
		System.out.println("TEST 1 :: Response Body :::: " + response.getBody());
		assertTrue(response.getBody().contains(expected));
	
	}
	
}
