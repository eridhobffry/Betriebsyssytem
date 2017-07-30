package Paging;

public class InternalClock {
    private static int ticks = 0;


    /**
     * Returns current value of <tt>ticks</tt>.
     *
     * @return current value of <tt>ticks</tt>.
     */
    public static int currentTicks()
    {
        return ticks;
    }

    /**
     * Advances clock by incrementing <tt>ticks</tt>.
     *
     * @return value of <tt>ticks</tt> after incrementing.
     */
    public static int nextTick()
    {
        return ++ticks;
    }
}
