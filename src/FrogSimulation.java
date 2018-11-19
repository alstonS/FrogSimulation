public class FrogSimulation {



        private int goalDistance;
        private int maxHops;

        public FrogSimulation(int dis, int numHops)
        {
            goalDistance = dis;
            maxHops = numHops;
        }

        private int hopDistance(){
            

        }
        public boolean simulate()
        {
            int position = 0;
            for(int count = 0; count < maxHops; count++)
            {
                position += hopDistance();
                if(position >= goalDistance)
                {
                    return true;
                }
                else if (position < 0)
                { return false; }
            }
            return false;
        }


        public double runSimulation(int num)
        {
            int countSucess=0;
            for(int i=0; i< num; i++)
            {
                if(simulate()) {
                    countSucess++;
                }
            }
            return (double) countSucess/num;
        }
}
