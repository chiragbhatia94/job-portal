package io.chiragbhatia94.jobportal.model;

/**
 * Assuming these are the job types that our portal supports
 */
public enum JobType {
    ENGINEERING("ENGINEERING"),
    ACCOUNTANT("ACCOUNTANT"),
    MANAGEMENT("MANAGEMENT"),
    TECHNICIAN("TECHNICIAN");

    private final String name;

    private JobType(String s) {
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
