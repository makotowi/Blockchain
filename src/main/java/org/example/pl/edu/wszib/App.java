package org.example.pl.edu.wszib;

import org.apache.commons.codec.digest.DigestUtils;
import org.example.pl.edu.wszib.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class App {


    public static void main(String[] args) {
        Random rand = new Random();

        String hash = "4d00d79b6733c9cc066584a02ed03410";

        List<Transaction> transactions = new ArrayList<>();


        for (int i = 0; i < 5; i++) {

            String findNonce = "";
            int nonce = 0;
            float ammount = rand.nextFloat(1000);

            while (!findNonce.endsWith("00000")) {
                Transaction transaction = new Transaction(ammount, hash, nonce);
                findNonce = DigestUtils.md5Hex(String.valueOf(transaction));
                if (!findNonce.endsWith("00000")) {
                    nonce++;
                } else {
                    transactions.add(transaction);
                    hash = findNonce;
                }
                }
            }
        System.out.println("                                             ");
        System.out.println("--------------------------------------------");
        System.out.println("Lista wszystkich wygenerowanych transakcji");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        }
    }




