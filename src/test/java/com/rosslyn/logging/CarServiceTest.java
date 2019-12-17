package com.rosslyn.logging;


import org.testng.annotations.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging(){
        CarService carService = new CarService();
        carService.process("BMW");
    }

}
