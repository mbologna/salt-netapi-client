package com.suse.saltstack.netapi.datatypes.target;

public class Grain implements Target<String> {

    private final String grain;
    private final String value;

    public Grain(String grain, String value) {
        this.grain = grain;
        this.value = value;
    }

    @Override
    public String getTarget() {
        return grain + ":" + value;
    }

    @Override
    public String getType() {
        return "grain";
    }
}
