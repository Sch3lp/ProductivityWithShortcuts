package be.swsb.productivity.chapter2.mud.ui;

import be.swsb.productivity.chapter2.mud.service.BallService;
import be.swsb.productivity.chapter2.mud.service.BallTO;

public class BallScreen {

    private BallService ballService;

    public BallScreen(BallService ballService) {
        this.ballService = ballService;
    }

    public void render(){
        BallTO ballTO = ballService.findBall("one");
        // render ballTO or whatever...
    }
}
