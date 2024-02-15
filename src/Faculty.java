public class Faculty extends Person{
    private myDOB HiringDate;
    private String FacultyID;

    Faculty(String firstName, String lastName, myDOB dob){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

  public void setFacultyID(String _FacultyID) {
      this.FacultyID = _FacultyID;
    }

   public String getFacultyID() {
      return this.FacultyID;
   }

   public void setHiringDate(myDOB _HiringDate) {
      this.HiringDate = new myDOB(_HiringDate);
   }

   public myDOB getHiringDate() {
      return this.HiringDate;
   }

    @Override
    public String toString() {
        return super.toString();
    }
}
