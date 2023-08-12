package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "truck")
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "truckID")
    private int truckID;

    @Column(name = "x")
    private int x;
    @Column(name = "y")
    private int y;

    @Column(name = "status")
    private String status;

    @Column(name = "available")
    private boolean available;
    public Truck() {
    }

    public Truck(int x, int y, String status,boolean a ) {
        this.x = x;
        this.y = y;
        this.status=status;
        this.available=a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getTruckID() {
        return truckID;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
