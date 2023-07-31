package be.swsb.productivity.chapter2.mud.ui;

import be.swsb.productivity.chapter2.mud.domain.Ball;
import be.swsb.productivity.chapter2.mud.domain.BallRepository;
import be.swsb.productivity.chapter2.mud.domain.RealBall;
import be.swsb.productivity.chapter2.mud.service.BallServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BallScreenTest {

    @Test
    public void screenCallsStuffToGenerateStackTrace() throws Exception {
        new BallScreen(new BallServiceImpl(new BallRepository())).render();
    }

    @Test
    public void compareTest() throws Exception {
        Arrays.asList(new Ball("1", 100), new RealBall("1",100));
    }
}