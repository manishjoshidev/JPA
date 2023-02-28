import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentAdd{
	@Id
	 private int Sid;
	 private String sName;
	 private double sPer;
	 private String sGender;

	    public int getSid() {
	        return Sid;
	    }

	    public String getsName() {
	        return sName;
	    }

	    public void setsName(String sName) {
	        this.sName = sName;
	    }

	    public double getsPer() {
	        return sPer;
	    }

	    public void setsPer(double sPer) {
	        this.sPer = sPer;
	    }

	    public String getsGender() {
	        return sGender;
	    }

	    public void setsGender(String sGender) {
	        this.sGender = sGender;
	    }

	    public void setSid(int sid) {
	        Sid = sid;
	        
	    }
	}

