/*https://stepik.org/lesson/12766/step/12?unit=3114*/

public static void moveRobot(Robot robot, int toX, int toY) {
    int x = robot.getX();
    int y = robot.getY();

    if (x > toX) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (x != toX) {
            robot.stepForward();
            x = robot.getX();
        }
    } else if (x < toX) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (x != toX) {
            robot.stepForward();
            x = robot.getX();
        }
    }

    if (y < toY) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }
        while (y != toY) {
            robot.stepForward();
            y = robot.getY();
        }
    } else if (y > toY) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }
        while (y != toY) {
            robot.stepForward();
            y = robot.getY();
        }
    }
}

public static class Robot {
    int x, y;

    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
        }
    }
}

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public void main() {
    Robot robot = new Robot();
//    moveRobot(robot, 5, 5);
    moveRobot(robot, -1, -3);
//    moveRobot(robot, -10, 5);
//    moveRobot(robot, 0, 0);

    System.out.println(robot.getX());
    System.out.println(robot.getY());
}