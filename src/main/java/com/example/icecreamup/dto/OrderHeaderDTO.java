package com.example.icecreamup.dto;

import java.util.Date;

public class OrderHeaderDTO 
{
	private int orderId;
	private String orderedBy;
	private String address;
	private String phoneNumber;
	private String email;
	private Date timeStamp;
	private String comments;
	
	public int getOrderId() 
	{
		return orderId;
	}
	
	public String getOrderedBy() 
	{
		return orderedBy;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
	public String getEmail() 
	{
		
		return email;
	}
	
	public Date getTimeStamp() 
	{
		return timeStamp;
	}
	
	public String getComments() 
	{
		return comments;
	}
	
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	
	public void setOrderedBy(String orderedBy) 
	{
		this.orderedBy = orderedBy;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public void setTimeStamp(Date timeStamp) 
	{
		this.timeStamp = timeStamp;
	}
	
	public void setComments(String comments) 
	{
		this.comments = comments;
	}
}
