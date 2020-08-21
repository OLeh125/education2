public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable();
        runnable.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x + 5 * y;
            }
        });

        runnable.run((x,y) -> x+3 * y);
    }
}

interface Executable{
    int execute(int x, int y);


}

class Runnable{

    public void run(Executable executable){
        int a = executable.execute(5,10);
        System.out.println(a);
    }
}