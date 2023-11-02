package edu.practikum.sprint4;
import org.junit.Test;


public class TestOrderInTheMiddle extends Temp {

    @Test
    public void openOrderInHeader() {
        order
                .clickCloseCookie()
                .scroll()
                .clickButtonOrderMiddle()
                .checkUrlOrder();
    }

}