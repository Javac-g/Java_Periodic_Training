package Stack;

public class Main {
    public static void main(String...args){
        Stack stack = new Stack(14);

        for (int i = 0; i < 17;i++)stack.push(i);
        for (int i = 0; i < 17;i++)System.out.print(stack.pop() + " ");
    }
}
