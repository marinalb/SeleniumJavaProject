package com.restfulbooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class HealthCheckTest {

    @Test
    public void healthCheck() {
        given().when().get("https://restful-booker.herokuapp.com/ping").then().assertThat().statusCode(201);
    }

    @Test
    public void getBookingId(){
        Response res = RestAssured.get("https://restful-booker.herokuapp.com/booking");
        res.print();
        Assert.assertEquals(res.getStatusCode(), 200, "Status code should be 200");
        List<Integer> bookingIds = res.jsonPath().getList("bookingid");
        Assert.assertFalse(bookingIds.isEmpty());
    }
}
