package com.vincentlaf.story.bean.result;

import java.util.List;

/**
 * Created by Johnson on 2018/1/3.
 */

public class QueryResult<T> {
    private List<T> rows;
    private long total;
    private boolean hasNext=true;
    /**
     * @return rows
     */
    public List<T> getRows() {
        return rows;
    }
    /**
     * @param rows 要设置的 rows
     */
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
    /**
     * @return total
     */
    public long getTotal() {
        return total;
    }
    /**
     * @param total 要设置的 total
     */
    public void setTotal(long total) {
        this.total = total;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
}
