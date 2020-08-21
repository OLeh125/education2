public class Main  {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("hello");
            }
        });

        runner.run(()-> System.out.println("hello"));


    }
}

class Runner{
    public void run(Executable executable){
        executable.execute();
    }
}

class ExecutableImplementation implements Executable{

    @Override
    public void execute() {
        System.out.println("hello");
    }
}