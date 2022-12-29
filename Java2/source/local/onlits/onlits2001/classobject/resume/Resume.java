package local.onlits.onlits2001.classobject.resume;

public final class Resume {
    Header header = new Header();
    String professionalSummary;
    Experience[] experiences = new Experience[10]; // Limitation
    static int experienceCount;

    void setHeader(String name, String address, String phone, String email) {
        header.setName(name);
        header.setAddress(address);
        header.setPhone(phone);
        header.setEmail(email);
    }

    void setProfessionalSummary(String professionalSummary) {
        this.professionalSummary = professionalSummary;
    }

    void setExperience(int serial, String designation, String dateFrom, String dateTo, String organization,
            String description, String[] highlights) {
        experiences[experienceCount] = new Experience();
        experiences[experienceCount].setDesignation(designation);
        experiences[experienceCount].setDateFrom(dateFrom);
        experiences[experienceCount].setDateTo(dateTo);
        experiences[experienceCount].setOrganization(organization);
        experiences[experienceCount].setDescription(description);
        experiences[experienceCount].setHighlights(highlights);
        experienceCount++;
    }

    void displayCenter() {
        Utility.alignCenter("RESUME");
        Utility.printLine();
        Utility.alignCenter(header.getName());
        Utility.alignCenter(header.getAddress());
        Utility.printLine();
        System.out.println("Professional Summary:");
        Utility.print80Columns(professionalSummary);
        Utility.printLine();
        System.out.println("Experience:");
        for (int i = 0; i < experienceCount; i++) {
            System.out.println(experiences[i].getDesignation() + " - " + experiences[i].getDateFrom() + " to "
                    + experiences[i].getDateTo() + " - " + experiences[i].getOrganization());
            System.out.println(experiences[i].getDescription());
            String[] highlights = experiences[i].getHighlights();
            for (String highlight : highlights) {
                System.out.println("- " + highlight);
            }
        }
    }

    void displayRight() {
        Utility.alignRight("RESUME");
        Utility.printLine();
        Utility.alignRight(header.getName());
        Utility.alignRight(header.getAddress());
        Utility.printLine();
        System.out.println("Professional Summary:");
        Utility.print80Columns(professionalSummary);
        Utility.printLine();
        System.out.println("Experience:");
        for (int i = 0; i < experienceCount; i++) {
            System.out.println(experiences[i].getDesignation() + " - " + experiences[i].getDateFrom() + " to "
                    + experiences[i].getDateTo() + " - " + experiences[i].getOrganization());
            System.out.println(experiences[i].getDescription());
            String[] highlights = experiences[i].getHighlights();
            for (String highlight : highlights) {
                System.out.println("- " + highlight);
            }
        }
    }

    void display() {
        displayCenter();
    }

    void display(int type) {
        switch (type) {
            case 1:
                displayCenter();
                break;
            case 2:
                displayRight();
                break;
        }
    }
}
