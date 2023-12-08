class Lift {
    private int currentFloor;

    public Lift(int initialFloor) {
        this.currentFloor = initialFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int move(int destinationFloor) {
        int moves = Math.abs(destinationFloor - currentFloor);
        currentFloor = destinationFloor;
        return moves;
    }
}
