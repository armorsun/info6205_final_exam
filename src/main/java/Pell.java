import java.util.ArrayList;
import java.util.List;

public class Pell {
    private long p0;
    private long p1;
    private List<Long> memory;

    public Pell() {
        p0 = 0;
        p1 = 1;
        memory = new ArrayList<>();
        memory.add(0, p0);
        memory.add(1, p1);
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        for (int i = 2; i <= n; i++){
            memory.add(i, 2 * memory.get(i-1) + memory.get(i-2));
        }

        return memory.get(n);
    }
}
