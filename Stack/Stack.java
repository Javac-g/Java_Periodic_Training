package Stack;

public class Stack {
    private int N;
    private int[] stck;

    public Stack(int size){
        N = -1;
        stck = new int[size];
    }

    public void push(int item){
        if (N == stck.length-1){
            System.out.println("full stack");
            int[] temp = new int[stck.length * 2];
            for(int i = 0; i < stck.length-1;i++){
                temp[i] = stck[i];
            }
            int h = stck.length-1;
            stck = temp;
            stck[h] = item-1;

        }
        stck[++N] = item;
    }
    public int pop(){
        if (N < 0){
            System.out.println("Empty Stack");
        }
        return stck[N--];
    }

}
