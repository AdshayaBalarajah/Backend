package com.foodie.request;

import com.foodie.model.Address;

import lombok.Data;

@Data
public class CreateOrderRequest {

    private Long restaurantId;

    private Address deliveryAddress;


}
