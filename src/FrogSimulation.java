public class FrogSimulation {



        private int goalDistance;
        private int maxHops;

        public FrogSimulation(int dis, int numHops)
        {
            goalDistance = dis;
            maxHops = numHops;
        }

        private int hopDistance(){

            int num = (int)((Math.random()*100)-5);
            int prob = (int)((Math.random()*100)-1);
            if (prob > 50)
            {

                return num;
            }
            else
            {
                return -1*num;
            }

        }
       
        public boolean simulate()
        {
            int position = 0;
            for(int count = 0; count < maxHops; count++)
            {
                int array1 = new array1[maxHops];
                int numb = hopDistance();
                position += numb;
                array1[count]=numb;
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
            int countSuccess=0;
            for(int i=0; i< num; i++)
            {
                if(simulate()) {
                    countSuccess++;
                }
            }
            return (double) countSuccess/num;
        }
}
