// Last updated: 30/05/2026, 00:04:25
class Entry {
    int key;
    int value;

    Entry(int k, int v) {
        this.key = k;
        this.value = v;
    }
}

class StockSpanner {
    Deque<Entry> stack;
    public StockSpanner() {
        stack = new ArrayDeque<Entry>();
    }

    public int next(int price) {
        int span=1;
        while (!stack.isEmpty() && stack.peek().key <= price) {
            span=span+stack.pop().value;
        }
        stack.push(new Entry(price, span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */