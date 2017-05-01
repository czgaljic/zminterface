package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by chris on 4/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pagination {
    int page;
    int current;
    int count;
    boolean prevPage;
    boolean nextPage;
    int limit;
    String paramType;
}
