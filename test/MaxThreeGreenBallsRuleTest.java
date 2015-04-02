package main.rule;

import main.Ball;
import main.Balls;
import main.Color;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxThreeGreenBallsRuleTest {

  @Test
  public void shouldEnsureThatThereAreMaximumOnlyThreeBalls() {
    Rule rule = new MaxThreeGreenBallsRule();
    Balls balls = new Balls();
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));

    boolean valid = rule.apply(balls, new Ball(Color.GREEN));

    assertEquals(false, valid);
  }

  @Test
  public void shouldAllowThreeBalls() {
    Rule rule = new MaxThreeGreenBallsRule();
    Balls balls = new Balls();
    balls.add(new Ball(Color.GREEN));
    balls.add(new Ball(Color.GREEN));

    boolean valid = rule.apply(balls, new Ball(Color.GREEN));

    assertEquals(true, valid);
  }


  @Test
  public void shouldAllowOtherColouredBalls() {
    Rule rule = new MaxThreeGreenBallsRule();
    Balls balls = new Balls();
    balls.add(new Ball(Color.BLUE));

    boolean valid = rule.apply(balls, new Ball(Color.RED));

    assertEquals(true, valid);
  }

  @Test
  public void shouldBeApplicableForGreenBallOnly() {
    Rule rule = new MaxThreeGreenBallsRule();

    assertEquals(true, rule.isApplicableTo(new Ball(Color.GREEN)));

    assertEquals(false, rule.isApplicableTo(new Ball(Color.BLUE)));

  }


}
