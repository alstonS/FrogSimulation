public class Runner {

    public static void main(String[] args)
    {
        FrogSimulation frog1 = new FrogSimulation(30, 5);

        FrogSimulation frog2 = new FrogSimulation(50, 10);

        FrogSimulation frog3 = new FrogSimulation(15, 2);

        System.out.println("The Frog Success: " + frog1.runSimulation(5));
        System.out.println("The Frog Success: " + frog2.runSimulation(5));
        System.out.println("The Frog Success: " + frog3.runSimulation(5));

    }

}
