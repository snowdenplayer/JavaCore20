public class MyThread extends Thread {

    int size ;
    public MyThread(int nextInt) {
        this.size = nextInt;
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
        System.out.print("Thread :");

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");

                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println();
        }

    }
}
