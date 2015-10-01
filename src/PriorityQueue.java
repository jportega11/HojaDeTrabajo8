//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Guillermo Javier de Leon Archila, 14022
//Jose pablo Ortega Grajeda, 14565

public interface PriorityQueue <E>{
	
    /**
     * Fetch lowest valued (highest priority) item from queue.
     *
     * @pre !isEmpty()
     * @post returns the minimum value in priority queue
     * 
     * @return The smallest value from queue.
     */
    public Comparable<E> getFirst();

    /**
     * Returns the minimum value from the queue.
     *
     * @pre !isEmpty()
     * @post returns and removes minimum value from queue
     * 
     * @return The minimum value in the queue.
     */
    public Comparable<E> remove();

    /**
     * Add a value to the priority queue.
     *
     * @pre value is non-null comparable
     * @post value is added to priority queue
     * 
     * @param value The value to be added.
     */
    public void add(Comparable <E>value);

    /**
     * Determine if the queue is empty.
     *
     * @post returns true iff no elements are in queue
     * 
     * @return True if the queue is empty.
     */
    public boolean isEmpty();

    /**
     * Determine the size of the queue.
     *
     * @post returns number of elements within queue
     * 
     * @return The number of elements within the queue.
     */
    public int size();

    /**
     * Remove all the elements from the queue.
     *
     * @post removes all elements from queue
     */
    public void clear();
}

