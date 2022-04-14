import java.util.Iterator;
import java.util.Random;

// Не уверен, что я правильно выполнил это задание, но других адекватных идей у меня не появилось и
// поставленную задачу эта реализация вроде выполняет :)
public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt((max - min) + 1) + min;
            }

        };
    }

}