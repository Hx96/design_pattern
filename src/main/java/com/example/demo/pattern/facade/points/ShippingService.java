package com.example.demo.pattern.facade.points;

public class ShippingService {
  public String delivery(GiftInfo giftInfo) {
    System.out.println(giftInfo.getName() + "进入物流系统");
    String shippingNo = "666";
    return shippingNo;
  }
}
