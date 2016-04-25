package be.swsb.productivity.chapter2.mud.ui;

import be.swsb.productivity.chapter2.mud.domain.BallRepository;
import be.swsb.productivity.chapter2.mud.service.BallServiceImpl;
import org.junit.Test;

public class BallScreenTest {

    @Test
    public void screenCallsStuff() throws Exception {
        new BallScreen(new BallServiceImpl(new BallRepository())).render();
    }
}