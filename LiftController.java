class LiftController {
    private Lift[] lifts;

    public LiftController(int numLifts, int numFloors) {
        lifts = new Lift[numLifts];
        for (int i = 0; i < numLifts; i++) {
            lifts[i] = new Lift((int) (Math.random() * numFloors));
        }
    }

    public Lift findClosestLiftWithMinTotalCount(int userCurrentFloor, int userDestinationFloor) {
        int minTotalCount = Integer.MAX_VALUE;
        Lift closestLift = null;

        for (Lift lift : lifts) {
            int movesToUser = Math.abs(lift.getCurrentFloor() - userCurrentFloor);
            int movesToDestination = Math.abs(userDestinationFloor - userCurrentFloor);
            int totalMoves = movesToUser + movesToDestination;

            if (totalMoves < minTotalCount) {
                minTotalCount = totalMoves;
                closestLift = lift;
            }
        }

        return closestLift;
    }

    public int getLiftPosition(int liftIndex) {
        return lifts[liftIndex].getCurrentFloor();
    }

    public void resetLiftPositions() {
        for (int i = 0; i < lifts.length; i++) {
            lifts[i] = new Lift((int) (Math.random() * lifts.length));
        }
    }
}
