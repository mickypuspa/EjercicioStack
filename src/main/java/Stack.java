public interface Stack<T> {
    public void push (T t) throws StackLlenoException;
    public T pop() throws StackVacioException;
    public int size();
}
