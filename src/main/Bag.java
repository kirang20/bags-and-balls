package main;

import main.rule.MaxThreeGreenBallsRule;
import main.rule.MaxTwelveBallRule;
import main.rule.Rules;

public class Bag {
  private Balls balls = new Balls();
  private Rules rules = new Rules();

  public Bag() {
    rules.add(new MaxThreeGreenBallsRule());
    rules.add(new MaxTwelveBallRule());
  }

  public Balls balls() {
    return balls;
  }

  public void addBall(Ball ball) {
    if (!rules.apply(balls, ball)) {
      return;
    }
    balls.add(ball);
  }
}
