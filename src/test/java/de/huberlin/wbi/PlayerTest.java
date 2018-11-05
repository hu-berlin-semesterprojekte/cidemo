package de.huberlin.wbi;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayerTest {


  @Test
  public void testContains() {

    Player p = new Player();
    Arrays.fill(p.playerCards, 2);

//    assertTrue(
//        p.claimRoute2(Player.PassengerColor.Red, 2, Player.PassengerColor.Red));
//    assertTrue(
//        p.claimRoute2(Player.PassengerColor.Red, 1, Player.PassengerColor.Red));
//
//    assertFalse(
//        p.claimRoute2(Player.PassengerColor.Black, 1, Player.PassengerColor.Red));
//
//    assertTrue(
//        p.claimRoute2(Player.PassengerColor.Rainbow, 2, Player.PassengerColor.Red));
//
//    assertTrue(
//        p.claimRoute2(Player.PassengerColor.Black, 2, Player.PassengerColor.Rainbow));

    // fill with Rainbow
    assertTrue(
        p.claimRoute2(Player.PassengerColor.Rainbow, 4, Player.PassengerColor.Black));


    System.out.println(Arrays.toString(p.playerCards));



  }































  public void testContains2() {

    Player p = new Player();
    Arrays.fill(p.playerCards, 3);

    assertTrue(p.claimRoute(Player.PassengerColor.Black, 1, Player.PassengerColor.Black));
    assertTrue(p.claimRoute(Player.PassengerColor.Red, 1, Player.PassengerColor.Rainbow));
    assertTrue(p.claimRoute(Player.PassengerColor.Rainbow, 1, Player.PassengerColor.Blue));

    assertFalse(p.claimRoute(Player.PassengerColor.Black, 2, Player.PassengerColor.Blue));
    assertFalse(p.claimRoute(Player.PassengerColor.Red, 10, Player.PassengerColor.Red));

    // pay by rainbow
    assertTrue(p.claimRoute(Player.PassengerColor.Black, 3, Player.PassengerColor.Black));

    // double spend
    // assertTrue(p.claimRoute(Player.PassengerColor.Rainbow, 2, Player.PassengerColor.Red));

    //     Blue, Black, Red, Rainbow
    System.out.println(Arrays.toString(p.playerCards));
    for (int c : p.playerCards) {
      assertTrue(c >= 0);
    }
  }
}
