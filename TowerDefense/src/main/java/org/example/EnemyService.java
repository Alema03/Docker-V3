package org.example;

public class EnemyService {
    private int health;
    private int damage;
    private int x;
    private int y;

    public EnemyService(int health, int damage, int x, int y) {
        this.health = health;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", damage=" + damage +
                ", position=(" + x + ", " + y + ")" +
                '}';
    }
}

