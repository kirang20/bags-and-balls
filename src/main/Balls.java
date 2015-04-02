package main;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Balls extends ArrayList<Ball> {

  private int countBy(Color color) {
    int count = 0;
    for (Ball ball : this) {
      if (ball.color().equals(color))
        count++;
    }
    return count;
  }

  public int numberOfGreenBalls() {
    return countBy(Color.GREEN);
  }

  public int numberOfRedBalls() {
    return countBy(Color.RED);
  }

  public int numberOfBlueBalls() {
    return countBy(Color.BLUE);
  }

  public int numberOfYellowBalls() {
    return countBy(Color.YELLOW);
  }
}
