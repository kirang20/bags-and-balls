package main.rule;

import main.Ball;
import main.Balls;

public class MaxTwelveBallRule implements Rule {

  @Override
  public boolean apply(Balls balls, Ball ball) {
    return balls.size() < 12;
  }

  @Override
  public boolean isApplicableTo(Ball ball) {
    return true;
  }

}
