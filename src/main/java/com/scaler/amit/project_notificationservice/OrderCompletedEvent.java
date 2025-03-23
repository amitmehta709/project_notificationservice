package com.scaler.amit.project_notificationservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderCompletedEvent {
    private String orderId;
    private String customerEmail;
    private String message;
}
