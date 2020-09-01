package io.chiragbhatia94.jobportal.model;

public enum ApplicationStatus {
    APPLIED("APPLIED"),
    ACCEPTED("ACCEPTED"),
    REJECTED("REJECTED");

    private final String name;

    private ApplicationStatus(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
