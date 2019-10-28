package com.example.jacksondemo.dto;

import java.util.List;

public class Root {
    private int totalCount;

    private List<Results> results;

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public List<Results> getResults() {
        return this.results;
    }
}
