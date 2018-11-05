package de.huberlin.wbi;

public class Player {

  public static enum PassengerColor {
    Blue, Black, Red, Rainbow
  }

  int[] playerCards = new int[4];

  /**
   * Claim a route between two adjacent cities using
   * the payByColor-passenger-cards in our hand
   * @param payByColor
   * @param routeCost
   * @param routeColor
   * @return
   */
  public boolean claimRouteNaive(
      PassengerColor payByColor,
      int routeCost,
      PassengerColor routeColor
  ) {
    int currentCards = playerCards[payByColor.ordinal()];

    // Pay for a route between two adjacent cities on the map
    if ( (payByColor == routeColor
        || payByColor == PassengerColor.Rainbow
        || routeColor == PassengerColor.Rainbow)) {
      if (currentCards >= routeCost) {
        playerCards[payByColor.ordinal()] -= routeCost;
        return true;
      }
    }

    // we cannot buy the route
    return false;

  }

  /**
   * Claim a route between two adjacent cities using
   * the payByColor-passenger-cards in our hand
   * @param payByColor
   * @param routeCost
   * @param routeColor
   * @return
   */
  public boolean claimRoute(
          PassengerColor payByColor,
          int routeCost,
          PassengerColor routeColor
      ) {
    int currentCards = playerCards[payByColor.ordinal()];
    int rainBowCards = playerCards[PassengerColor.Rainbow.ordinal()];

    // Pay for a route between two adjacent cities on the map
    if ( (payByColor == routeColor
            || payByColor == PassengerColor.Rainbow
            || routeColor == PassengerColor.Rainbow)) {
      // no rainbow cards needed
      if (currentCards >= routeCost) {
        playerCards[payByColor.ordinal()] -= routeCost;
        return true;
      }
      // rainbow cards are needed
      else if (currentCards + rainBowCards >= routeCost){
        playerCards[payByColor.ordinal()]= 0;
        playerCards[PassengerColor.Rainbow.ordinal()] -= (routeCost - currentCards);
        return true;
      }
    }

    // we cannot buy the route
    return false;

  }


}
