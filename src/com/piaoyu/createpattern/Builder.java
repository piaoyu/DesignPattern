package com.piaoyu.createpattern;

/**
 * Builder模式
 * 
 * @author piaoyu
 * @since 2014-3-2
 */
public class Builder {

    private final int baseElem;
    private final int extendElem;

    private Builder(Build build) {
        baseElem = build.baseElem;
        extendElem = build.extendElem;
    }

    public static class Build {

        private final int baseElem;
        private int       extendElem;

        public Build(int baseElem) {
            this.baseElem = baseElem;
        }

        public Build extend(int value) {
            extendElem = value;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }
    }

}
