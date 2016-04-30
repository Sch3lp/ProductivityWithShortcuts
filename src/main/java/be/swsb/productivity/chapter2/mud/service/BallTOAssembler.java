package be.swsb.productivity.chapter2.mud.service;

import be.swsb.productivity.chapter2.mud.domain.Ball;

public class BallTOAssembler {
    public BallTO assembleTOFrom(Ball ball) {
        BallTO ballTO = new BallTO();
        ballTO.setId(ball.getId());
        ballTO.setSize(ball.getSize());

        return ballTO;
    }
}
