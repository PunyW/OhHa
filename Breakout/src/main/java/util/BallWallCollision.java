package util;

import entities.Player;
import sprites.Ball;

public class BallWallCollision {

    // Game dimensions
    private final int width;
    private final int height;

    public BallWallCollision(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void checkCollisions(Ball ball, Player player) {
        checkCeiling(ball);
        checkFloor(ball, player);
        checkRightWall(ball);
        checkLeftWall(ball);
    }

    private void checkCeiling(Ball ball) {
        if (ball.getY() <= 0) {
            // Revert balls upward momementum
            ball.setDy(-ball.getDy());
        }
    }

    private void checkRightWall(Ball ball) {
        if (ball.getX() + ball.getWidth() * 2 >= width) {
            // Revert balls sideways momentum
            ball.setDx(-ball.getDx());
        }
    }

    private void checkLeftWall(Ball ball) {
        if (ball.getX() <= 0) {
            // Revert balls sideways momentum
            ball.setDx(-ball.getDx());
        }
    }

    private void checkFloor(Ball ball, Player player) {
        if (ball.getY() + ball.getHeight() * 2 >= height) {
            ball.resetBall();
//            player.loseLife();
        }
    }
}