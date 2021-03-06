package com.github.levin81.daelic.druid.postaggregator;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LongGreatestPostAggregator implements PostAggregator {

    private final String type = "longGreatest";

    private String name;
    private List<PostAggregator> fields;

    LongGreatestPostAggregator(String name, List<PostAggregator> fields) {
        this.name = name;
        this.fields = fields;
    }

    @Override
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public List<PostAggregator> getFields() {
        return fields;
    }

    public static LongGreatestPostAggregatorBuilder builder() {
        return new LongGreatestPostAggregatorBuilder();
    }

    public static class LongGreatestPostAggregatorBuilder {

        private String name;
        private List<PostAggregator> fields;

        LongGreatestPostAggregatorBuilder() {

        }

        public LongGreatestPostAggregatorBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public LongGreatestPostAggregatorBuilder withFields(List<PostAggregator> fields) {
            this.fields = new ArrayList<>(fields);
            return this;
        }

        public LongGreatestPostAggregator build() {
            return new LongGreatestPostAggregator(name, fields);
        }
    }
}
