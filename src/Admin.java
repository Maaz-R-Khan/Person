public class Admin extends Person {
    private String AdminID;
    private myDOB HiringDate;

    Admin(String firstName, String lastName, myDOB dob) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    public void setAdminID(String _AdminID) {
        this.AdminID = _AdminID;
    }

    public String getAdminID() {
        return this.AdminID;
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
