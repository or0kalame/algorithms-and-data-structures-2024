package ru.mirea.practice.pr7;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        this.topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        this.bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    private boolean hasSameSpeed() {
        return topLeft.xspeed == bottomRight.xspeed && topLeft.yspeed == bottomRight.yspeed;
    }

    @Override
    public void moveUp() {
        if (hasSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.out.println("Точки движутся с разной скоростью.");
        }
    }

    @Override
    public void moveDown() {
        if (hasSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        } else {
            System.out.println("Точки движутся с разной скоростью.");
        }
    }

    @Override
    public void moveLeft() {
        if (hasSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        } else {
            System.out.println("Точки движутся с разной скоростью.");
        }
    }

    @Override
    public void moveRight() {
        if (hasSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        } else {
            System.out.println("Точки движутся с разной скоростью.");
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }
}