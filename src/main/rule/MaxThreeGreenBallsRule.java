package main.rule;

import main.Ball;
import main.Balls;
import main.Color;

public class MaxThreeGreenBallsRule implements Rule {

  @Override
  public boolean apply(Balls balls, Ball ball) {
    return (balls.numberOfGreenBalls() < 3);
  }

  @Override
  public boolean isApplicableTo(Ball ball) {
    return ball.color().equals(Color.GREEN);
  }
}
