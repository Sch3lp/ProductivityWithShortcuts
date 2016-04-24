package be.swsb.productivity.chapter2.mud.service;

import be.swsb.productivity.chapter2.mud.domain.Ball;
import be.swsb.productivity.chapter2.mud.domain.BallRepository;

public class BallServiceImpl implements BallService {

    private BallRepository ballRepository;
    private BallTOAssembler ballTOAssembler;

    public BallServiceImpl(BallRepository ballRepository) {
        this.ballRepository = ballRepository;
    }

    @Override
    public BallTO findBall(String id) {
        Ball ball = ballRepository.lookupById(id);
        return ballTOAssembler.assembleTOFrom(ball);
    }
}
