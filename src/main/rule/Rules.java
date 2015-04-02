package main.rule;

import main.Ball;
import main.Balls;

import java.util.ArrayList;

public class Rules extends ArrayList<Rule> {
  public boolean apply(Balls balls, Ball ball) {
    for (Rule rule : this) {
      if (rule.isApplicableTo(ball) && !rule.apply(balls, ball)) {
        return false;
      }
    }
    return true;
  }
}
