package main.rule;

import main.Ball;
import main.Balls;

public interface Rule {

  boolean apply(Balls balls, Ball ball);

  boolean isApplicableTo(Ball ball);
}
