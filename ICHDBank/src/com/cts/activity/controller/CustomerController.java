package com.cts.activity.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.activity.model.AccountEntity;
import com.cts.activity.model.CustomerEntity;
import com.cts.activity.model.FundTransferEntity;

public class CustomerController {

		public static void main(String[] args) {
			
			ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
			FundTransferEntity entity=(FundTransferEntity)context.getBean("fund");
			AccountEntity account=entity.getSender();
			CustomerEntity customer=account.getOwner();
//			System.out.println(customer);
			System.out.println("sender is : "+entity.getSender());
			System.out.println("receiver is : "+entity.getReceiver());
			System.out.println("amount transfered : "+entity.getAmount());
			System.out.println("account id : "+account.getAccountId());
			
		}
}
