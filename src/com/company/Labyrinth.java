package com.company;

import java.util.List;
import java.util.Map;

public class Labyrinth {
    private final Map<Long, List<Long>> graph;
    private final Long start;
    private final Long finish;
    public Labyrinth( Map<Long, List<Long>> graph, Long start, Long finish ) {this.graph = graph;
        this.start = start;
        this.finish = finish;
    }

    public List<Long> whereCanIGoFrom(Long point) {
        //TODO: check constraints
        return graph.get( point );
    }

    public Long getStart() {
        return start;
    }

    public Long getFinish() {
        return finish;
    }
}
