package main.rule;

import main.Ball;
import main.Balls;
import main.Color;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTwelveBallsRuleTest {

  @Test
  public void shouldEnsureThatThereAreMaximumOfTwelveBalls() {
    Rule rule = new MaxTwelveBallRule();
    Balls balls = new Balls();

    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));

    boolean valid = rule.apply(balls, new Ball(Color.GREEN));

    assertEquals(false, valid);
  }

  @Test
  public void shouldBeApplicableForAnyBall() {
    Rule rule = new MaxTwelveBallRule();
    assertEquals(true, rule.isApplicableTo(new Ball(Color.BLUE)));
    assertEquals(true, rule.isApplicableTo(new Ball(Color.GREEN)));
    assertEquals(true, rule.isApplicableTo(new Ball(Color.RED)));
    assertEquals(true, rule.isApplicableTo(new Ball(Color.YELLOW)));
  }


}
