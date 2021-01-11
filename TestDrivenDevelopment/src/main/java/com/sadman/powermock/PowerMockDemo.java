package com.sadman.powermock;


import java.awt.*;

public class PowerMockDemo {
    public Point callPrivateMethod() {
        return privateMethod(new Point(1, 1));
    }

    private Point privateMethod(Point point) {
        return new Point((int)point.getX() + 1, (int)point.getY() + 1);
    }
}
