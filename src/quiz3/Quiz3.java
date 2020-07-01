/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import singlylinkedlist.SNode;

/**
 *
 * @author user
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               Register r1 = new Register(1, "CET");
               Register r2 = new Register(3, "CCJE");
               Register r3 = new Register(6, "CHATME");
               Register r4 = new Register(8, "SMBE");
               Register r5 = new Register(9, "STE");

        SNode<Register> registered1 = new SNode<>(r1, null);
        SNode<Register> registered2 = new SNode<>(r2, null);
        SNode<Register> registered3 = new SNode<>(r3, null);
        SNode<Register> registered4 = new SNode<>(r4, null);
        SNode<Register> registered5 = new SNode<>(r5, null);

        QueuList<SNode> transaction = new QueuList<>();
        transaction.enqueue(registered1);
        transaction.enqueue(registered2);
        transaction.enqueue(registered3);
        transaction.enqueue(registered4);
        transaction.enqueue(registered5);

        try {
            displayTransactions(transaction);
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
        } catch (EmptyQueueException ex) {
            System.out.println("The queue is empty.");
        }

    }

    private static void displayTransactions(QueuList<SNode> queueList) throws EmptyQueueException {
        SNode<Register> temp = queueList.first();
        for (int i = 0; i < queueList.size(); i++) {
            System.out.println("Transaction No." + (i + 1) + " : " + temp.getElement().getName()
                    + ", ID number: " + temp.getElement().getRegister());
            temp = temp.getNext();
        }
    }
}