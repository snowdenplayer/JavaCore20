public class RunnableThread implements Runnable {

    int size ;
    public RunnableThread(int t) {
        this.size = t;
    }

    @Override
    public void run() {
        int []arr = new int[size];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            int tmp = 1;
            arr[i]= arr[i-1]+arr[i-2];
        }
        System.out.print("Runnable :");
        try {
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");

                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
