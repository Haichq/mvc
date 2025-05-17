package de.tum.in.ase.eist.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Sequential log of all Transactions
// Must implement the following methods:
// - insertTransaction(Transaction transaction): boolean
// - begin(): Transaction
// - next(Transaction transaction): Transaction
//
// DO NOT CHANGE THE EXISTING METHOD SIGNATURES
// Add any fields you like
// You may add private helper methods
public class TransactionLog {
    // Add fields here
    //
    private List<Transaction> transactionList;
    // Constructor
    // TODO L03P02 Model 1.1:Implement the Constructor in TransactionLog

    public TransactionLog() {
        transactionList = new ArrayList<>();
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }


    // Append a Transaction to the TransactionLog
    // Returns true when succesful
    // TODO L03P02 Model 1.2: Implement the insertTransaction method in TransactionLog
    //  The method takes a Transaction as an input and appends it to the log,
    //  returning if the transaction was successfully inserted or not.
    public boolean insertTransaction(Transaction transaction) {
        if (transaction == null){
            return false;
        }
        return transactionList.add(transaction);

    }

    // Returns the first Transaction in the TransactionLog
    // TODO L03P02 Model 1.3: Implement the begin method in TransactionLog
    //  this method returns the first Transaction in the log. If the log is empty, it should return null.
    public Transaction begin() {
        if (transactionList.isEmpty()) {
            return null;
        }
        return transactionList.get(0);
    }

    // Given a Transaction, returns the next Transaction in the TransactionLog
    // Returns null if the given Transaction is not in the TransactionLog
    // Returns null if there is no succeeding Transaction
    // TODO L03P02 Model 1.4: Implement the next method in TransactionLog.
    //  The next method in the TransactionLog class takes a Transaction as input and returns the next transaction in the TransactionLog.
    //  If there is no next transaction or the input is not in TransactionLog, it should return null.
    public Transaction next(Transaction transaction) {
        if (!transactionList.contains(transaction) || transactionList.size() == 1) {
            return null;
        }
       //Iterator
        return null;
    }

}
