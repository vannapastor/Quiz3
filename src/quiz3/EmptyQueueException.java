/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

/**
 *
 * @author user
 */
class EmptyQueueException extends Exception {
    public EmptyQueueException(){
        super("The queue is empty.");
    }
}

