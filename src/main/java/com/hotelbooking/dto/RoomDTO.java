package com.hotelbooking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hotelbooking.entity.Booking;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {

    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private String roomPictureUrl;
    private String roomDescription;
    private List<BookingDTO> bookings;
}
