package Core;
/**
 * Candidate
 */
class Candidate {

  String name;
  private int no;
  String address;
  boolean haveExperience;
  String[] skills = new String[15];

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public boolean isHaveExperience() {
    return haveExperience;
  }

  public void setHaveExperience(boolean haveExperience) {
    this.haveExperience = haveExperience;
  }

  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }
}

public class GetSetDemo {

  public static void main(String[] args) {
    Candidate candidateObj = new Candidate();
    String name = "preksha";
    if (candidateObj.getNo() == 0) candidateObj.setNo(
      1
    ); else candidateObj.setNo(candidateObj.getNo() + 2);
    String address = "Gujrat";
    boolean haveExperience = true;
    String[] skills = { "java", "Java Script", "SQL" };

    //Set variables
    candidateObj.setName(name);
    candidateObj.setAddress(address);
    candidateObj.setHaveExperience(haveExperience);
    candidateObj.setSkills(skills);

    //Print object value
    System.out.println(
      "(" + candidateObj.getNo() + ") " + candidateObj.getName()
    );
    // Scanner sc = new Scanner(System.in);
    // Candidate candidateObj[] = new Candidate[5];
    // for (Candidate candidate : candidateObj) {
    //   System.out.println(candidate);
    //   System.out.println("Enter Candidate Name: ");
    //   String name = sc.nextLine();
    //   candidate.setName(name);
    //   int number = candidate.getNo();
    //   if (number == 0) {
    //     candidate.setNo(0);
    //   } else {
    //     candidate.setNo(candidate.getNo() + 1);
    //   }
    // }
  }
}
