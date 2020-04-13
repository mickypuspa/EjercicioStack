import org.junit.*;

public class StackImplementation<T> implements Stack<T> {
    private int limite;
    private int p;
    private T[] data;

    public StackImplementation(int num) {
      data = (T[]) new Object[num];
      setLimite(num);
    }

    public void setLimite(int var) {
        this.limite = var;
    }

    public int getLimite() {
        return this.limite;
    }

    public boolean llena(){
        if(p>limite)
            return true;
        else
            return false;
    }

    @Override
    public void push(T t) throws StackLlenoException {
        if(this.llena()){
            throw new StackLlenoException();
        }
        this.data[this.p++] = t;
        this.p++;
    }

    @Override
    public T pop() throws StackVacioException {
        if(this.size()==0){
            throw new StackVacioException();
        }
        T t = this.data[this.p--];
        this.p--;
        return t;
    }

    @Override
    public int size() {
        return p;
    }
}
