package local.onlits.onlits2001.classobject.resume;

public class Experience {
    private String designation;
    private String dateFrom;
    private String dateTo;
    private String organization;
    private String description;
    private String[] highlights;
    
    void setDesignation(String designation) {
        this.designation = designation;
    }

    String getDesignation() {
        return designation;
    }

    void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    String getDateFrom() {
        return dateFrom;
    }

    void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    String getDateTo() {
        return dateTo;
    }

    void setOrganization(String organization) {
        this.organization = organization;
    }

    String getOrganization() {
        return organization;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }

    void setHighlights(String[] highlights) {
        this.highlights = highlights;
    }

    String[] getHighlights() {
        return highlights;
    }
}
