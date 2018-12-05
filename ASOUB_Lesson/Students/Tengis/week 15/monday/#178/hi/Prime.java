public class Prime {

    public void hi() 
    {

        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                
                if(low % i == 0) {
                    flag = true;
                    ;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
}