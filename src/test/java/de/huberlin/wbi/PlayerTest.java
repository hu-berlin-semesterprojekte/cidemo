package de.huberlin.wbi;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

  @Test
  public void testContains() {

    Player p = new Player();
    Arrays.fill(p.playerCards, 3);

    assertTrue(p.claimRoute(Player.PassengerColor.Black, 1, Player.PassengerColor.Black));
    assertTrue(p.claimRoute(Player.PassengerColor.Red, 1, Player.PassengerColor.Rainbow));
    assertTrue(p.claimRoute(Player.PassengerColor.Rainbow, 1, Player.PassengerColor.Blue));

    assertFalse(p.claimRoute(Player.PassengerColor.Black, 2, Player.PassengerColor.Blue));
    assertFalse(p.claimRoute(Player.PassengerColor.Red, 10, Player.PassengerColor.Red));
    
    //     Blue, Black, Red, Rainbow
    System.out.println(Arrays.toString(p.playerCards));
    for (int c : p.playerCards) {
      assertTrue(c >= 0);
    }
  }
}
