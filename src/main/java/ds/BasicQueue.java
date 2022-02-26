package ds;

public class BasicQueue<X> {
    private X[] data;
    int front;
    int end;

    public BasicQueue(){
        this(1000);
    }

    public BasicQueue(int size) {
        front = -1;
        end = -1;
        data = (X[])new Object[size];
    }

    public int size(){
        if(front == -1 && end == -1){
            return 0;
        }
        return (end - front + 1);
    }

    public void enqueu(X val) {
        if((end+1) > data.length){
            throw new IllegalArgumentException("The Queue is Full");
        }
        if(end == -1) {
            front = 0;
            end = 0;
            data[end] = val;
        } else {
            data[++end] = val;
        }
    }

}
