import java.util.Scanner;

public class MultiLiftSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LiftController controller = new LiftController(4, 10);

        while (true) {
            System.out.print("Enter current floor (or -1 to exit): ");
            int currentFloor = scanner.nextInt();

            if (currentFloor == -1) {
                break;
            }

            System.out.print("Enter destination floor: ");
            int destinationFloor = scanner.nextInt();

            Lift closestLift = controller.findClosestLiftWithMinTotalCount(currentFloor, destinationFloor);

            if (closestLift != null) {
                System.out.print("Lift positions: ");
                for (int i = 0; i < 4; i++) {
                    System.out.print("Lift-" + (char) ('A' + i) + " at " + controller.getLiftPosition(i));
                    if (i < 3) {
                        System.out.print(",");
                    }
                }
                System.out.println(".");

                System.out.println("Lift -" + (char) ('A' + findLiftIndex(controller, closestLift)) +
                        " has the minimum total count to reach your destination. Please press lift " +
                        (char) ('A' + findLiftIndex(controller, closestLift)));

                int movesToUser = closestLift.move(currentFloor);
                int movesToDestination = closestLift.move(destinationFloor);
                int totalMoves = movesToUser + movesToDestination;

    
                System.out.println("Lift is moving from floor " + currentFloor +
                        " to floor " + destinationFloor);
                System.out.println("Lift has arrived at floor " + destinationFloor);
                System.out.println("Total moves: " + totalMoves);

                controller.resetLiftPositions();
                System.out.println("Lift positions have been reset.");
            } else {
                System.out.println("No lifts available. Please try again.");
            }
        }

        scanner.close();
    }

    private static int findLiftIndex(LiftController controller, Lift lift) {
        for (int i = 0; i < 4; i++) {
            if (controller.getLiftPosition(i) == lift.getCurrentFloor()) {
                return i;
            }
        }
        return -1;
    }
}
