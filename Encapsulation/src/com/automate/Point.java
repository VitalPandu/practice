package com.automate;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
    double distance(){
        return Math.sqrt(Math.pow((x-0),2)+Math.pow((y-0),2));
    }
   double distance(int x, int y){
       return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    double distance(Point p) {
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }
}
