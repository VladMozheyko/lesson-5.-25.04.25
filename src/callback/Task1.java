package callback;

public class Task1 {

    Callback callback;

    public Task1(Callback callback) {
        this.callback = callback;
    }


    public void doTask(int number){
        System.out.println("Задача " +number + "....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        callback.callbackMethod();
    }

}
