package callback;

public class Main2 implements Callback{


    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.task();
    }

    public void task(){
        Task1 task1 = new Task1(this);
        task1.doTask(2);
    }


    @Override
    public void callbackMethod() {
        System.out.println("Вызов в Main2");
    }
}
