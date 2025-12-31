package com.inheritance;

class Order{
	int orderId;
	String orderDate;
	Order(int orderId,String orderDate){
		this.orderId=orderId;
		this.orderDate=orderDate;
	}
	public String getOrderStatus(){
		return "Order Placed";
	}
}

class ShippedOrder extends Order{
	String trackingNumber;
	ShippedOrder(int orderId,String orderDate,String trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber=trackingNumber;
	}
	public String getOrderStatus(){
		return "Order Shipped";
	}
}

class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	DeliveredOrder(int orderId,String orderDate,String trackingNumber,String deliveryDate){
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	public String getOrderStatus(){
		return "Order Delivered";
	}
}

public class OrderManagementSystem{
	public static void main(String[] args){
		Order order=new Order(1001,"2024-01-10");
		ShippedOrder shippedOrder=new ShippedOrder(1002,"2024-01-11","TRK12345");
		DeliveredOrder deliveredOrder=new DeliveredOrder(1003,"2024-01-12","TRK67890","2024-01-15");
		System.out.println(order.getOrderStatus());
		System.out.println(shippedOrder.getOrderStatus());
		System.out.println(deliveredOrder.getOrderStatus());
	}
}

