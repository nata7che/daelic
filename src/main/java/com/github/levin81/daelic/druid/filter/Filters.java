package com.github.levin81.daelic.druid.filter;

public final class Filters {

    public static AndFilter.AndFilterBuilder AND() {
        return AndFilter.builder();
    }

    public static void BOUND() {

    }

    public static InFilter.InFilterBuilder IN() {
        return InFilter.builder();
    }

    public static void INTERVAL() {

    }

    public static JavascriptFilter.JavascriptFilterBuilder JAVASCRIPT() {
        return JavascriptFilter.builder();
    }

    public static LikeFilter.LikeFilterBuilder LIKE() {
        return LikeFilter.builder();
    }

    public static NotFilter.NotFilterBuilder NOT() {
        return NotFilter.builder();
    }

    public static OrFilter.OrFilterBuilder OR() {
        return OrFilter.builder();
    }

    public static RegexFilter.RegexFilterBuilder REGEX() {
        return RegexFilter.builder();
    }

    public static void SEARCH() {

    }

    public static SelectorFilter.SelectorFilterBuilder SELECTOR() {
        return SelectorFilter.builder();
    }

    public static void SPATIAL() {

    }
}
