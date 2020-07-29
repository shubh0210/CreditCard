package com.banking.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Column(name="pan_number")
    @Id
    private String panNumber;

    @Column(name = "credit_score")
    private double creditScore;

    public User() {
    }

    public User(String panNumber, double creditScore) {
        this.panNumber = panNumber;
        this.creditScore = creditScore;
    }



    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "User{" +
                "panNumber='" + panNumber + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}
