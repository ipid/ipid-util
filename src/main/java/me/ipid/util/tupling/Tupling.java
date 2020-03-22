package me.ipid.util.tupling;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public abstract class Tupling
        implements Iterable<Object>, Serializable, Cloneable {

    private static final long serialVersionUID = 927504735772663261L;
    protected Object[] valueList;

    @SuppressWarnings("unchecked")
    protected static int compare(Tupling curr, Tupling other) {
        if (other == null) {
            throw new NullPointerException("Comparing tupling to null");
        }

        for (int i = 0; i < curr.valueList.length; i++) {
            int res = ((Comparable) curr.valueList[i]).compareTo(other.valueList[i]);
            if (res != 0) {
                return res;
            }
        }

        return 0;
    }

    /**
     * Get the value at a specific position in the tuple.
     * When index is out of bound, throw IllegalArgumentException.
     *
     * @param index the position of the value to be retrieved.
     * @return the value
     */
    public Object get(int index) {
        if (index < 0 || index >= valueList.length) {
            String className = this.getClass().getSimpleName();

            throw new IllegalArgumentException(
                    "Can't retrive position " + index + ". tupling." +
                            className + " has only " + valueList.length + " elements, " +
                            "and positions start with 0 and end with " + (valueList.length - 1) + " (inclusive)."
            );
        }

        return valueList[index];
    }

    /**
     * Return how many elements are there in the tuple.
     *
     * @return The size of tuple
     */
    public int getSize() {
        return valueList.length;
    }

    @Override
    public Iterator<Object> iterator() {
        return Arrays.stream(valueList).iterator();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(valueList);
    }

    /**
     * Method for test purpose.
     *
     * @return valueList
     */
    protected Object[] getValueList() {
        return valueList;
    }

    protected void nullCheckOfAdd(Object t) {
        if (t == null) {
            throw new NullPointerException("Parameter of add(t) method can't be null");
        }
    }
}
