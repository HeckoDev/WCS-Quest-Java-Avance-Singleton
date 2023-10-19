import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Flow;

public class Transactions {

    public static void withdraw(Bank account, int value, TransactionListener listener) {
        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                listener.onComplete(account);
            }
        }, time);
    }
}
