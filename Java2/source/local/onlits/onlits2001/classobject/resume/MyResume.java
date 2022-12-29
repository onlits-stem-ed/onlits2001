package local.onlits.onlits2001.classobject.resume;

public class MyResume {
    public static void main(String[] args) {
        Resume myResume = new Resume();
        myResume.setHeader("Ravi Kumar", "Srinagar Colony, Muzaffarpur", "9865745896", "ravi.kumar@onlits.com");        
        myResume.setProfessionalSummary("A passonate software engineer looking for a challenging responsibility in your esteemed organization. 'At home in' technologies HTML, CSS, JS, Java, Spring, SpringBoot.");
        String[] highlights = {
            "Check with the team the status of the assigned work.",
            "Overall responsibility and accountability for the alloted feature",
            "Responsible for the performance of team",
            "Ascertaining and fulfilling the manpower requirement in respect to the project/feature alloted"
        };
        myResume.setExperience(1,"Senior Software Development Engineer", "01/03/2022", "Current", "ONLITS TECHNOLOGIES LLP", "Full stack .Net Developer...", highlights);
        
        highlights[0] = "Write code as per the designs provided by the concerned team.";
        highlights[1] = "Test code for quality assuarance";
        
        myResume.setExperience(2, "Software Development Engineer", "01/05/2020", "28/02/2022", "ONLITS TECHNOLOGIES LLP", "Full stack .Net Developer", highlights);
        
        myResume.display(1);
        // myResume.display(2);
    }
}
