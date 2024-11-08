package org.example.pl.edu.wszib.transaction;


public class Transaction {
    private double ammount;
    private String lastTrnsaction;
    private int nonce;

    public Transaction(double ammount, String lastTrnsaction, int nonce) {
        this.ammount = ammount;
        this.lastTrnsaction = lastTrnsaction;
        this.nonce = nonce;

    }


    public Transaction() {
    }


    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public String getLastTrnsaction() {
        return lastTrnsaction;
    }

    public void setLastTrnsaction(String lastTrnsaction) {
        this.lastTrnsaction = lastTrnsaction;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "ammount=" + ammount +"\n" +
                "lastTrnsaction='" + lastTrnsaction + '\'' + "\n" +
                "nonce=" + nonce + "\n" +
                '}';
    }

}
