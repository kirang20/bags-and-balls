package main.rule;

import main.Bag;
import main.Ball;
import main.Color;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {
  @Test
  public void shouldAddABall() {
    //Arrange
    Bag bag = new Bag();
    //Act
    bag.addBall(new Ball(Color.GREEN));
    //Assert
    assertEquals(1, bag.balls().size());
  }

  @Test
  public void shouldAddAGreenBall() {
    Bag bag = new Bag();

    bag.addBall(new Ball(Color.GREEN));

    assertEquals(1, bag.balls().size());
    assertEquals(1, bag.balls().numberOfGreenBalls());
  }

  @Test
  public void shouldAddARedBall() {
    Bag bag = new Bag();

    bag.addBall(new Ball(Color.RED));

    assertEquals(1, bag.balls().size());
    assertEquals(1, bag.balls().numberOfRedBalls());
  }


  @Test
  public void shouldAddAYellowBall() {
    Bag bag = new Bag();

    bag.addBall(new Ball(Color.YELLOW));

    assertEquals(1, bag.balls().size());
    assertEquals(1, bag.balls().numberOfYellowBalls());
  }


  @Test
  public void shouldAddABlueBall() {
    Bag bag = new Bag();

    bag.addBall(new Ball(Color.BLUE));

    assertEquals(1, bag.balls().size());
    assertEquals(1, bag.balls().numberOfBlueBalls());
  }

  @Test
  public void shouldNotAllowFourthGreenBallToGetAddedToBag() {
    Bag bag = new Bag();

    bag.addBall(new Ball(Color.GREEN));
    bag.addBall(new Ball(Color.GREEN));
    bag.addBall(new Ball(Color.GREEN));

    bag.addBall(new Ball(Color.GREEN));

    assertEquals(3, bag.balls().size());
    assertEquals(3, bag.balls().numberOfGreenBalls());
  }

  @Test
  public void shouldNotAllowThirteenthBallToGetAddedToBag() {
    Bag bag = new Bag();

    bag.addBall(new Ball(Color.GREEN));
    bag.addBall(new Ball(Color.GREEN));
    bag.addBall(new Ball(Color.GREEN));
    bag.addBall(new Ball(Color.BLUE));
    bag.addBall(new Ball(Color.BLUE));
    bag.addBall(new Ball(Color.BLUE));
    bag.addBall(new Ball(Color.RED));
    bag.addBall(new Ball(Color.RED));
    bag.addBall(new Ball(Color.YELLOW));
    bag.addBall(new Ball(Color.YELLOW));
    bag.addBall(new Ball(Color.YELLOW));
    bag.addBall(new Ball(Color.YELLOW));

    bag.addBall(new Ball(Color.YELLOW));

    assertEquals(12, bag.balls().size());
  }
}
