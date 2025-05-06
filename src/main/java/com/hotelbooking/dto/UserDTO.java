package com.hotelbooking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hotelbooking.entity.Booking;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String userRole;
    private List<BookingDTO> bookings = new ArrayList<BookingDTO>();
}
