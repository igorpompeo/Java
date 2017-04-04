/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaestatica;

/**
 *
 * @author igor
 */
public interface FilaInt {
    void enqueue(int value);
    int dequeue();
    int front(); //ConsultarPrimeiro
    boolean isEmpty();
    boolean isFull();
    int size();
}
