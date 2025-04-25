package callback;

public class Main1 implements Callback{

    public static void main(String[] args) {

        Main1 main1 = new Main1();
        main1.task();

    }

    public void task(){
        Task1 task1 = new Task1(this);
        task1.doTask(1);
    }

    @Override
    public void callbackMethod() {
        System.out.println("Вызов в Main1");
    }
}
