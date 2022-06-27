package doselect;

public class Source4 {
	public static String searchForJob(int age, String highestQualification) throws
	NotEligibleException {
	String s = new String();
	if (age >= 200 || age <= 0) {
	throw new NotEligibleException("The age entered is not typical for a human being");
	}
	else {
	s = CompanyJobRepository.getJobPrediction(age,
	highestQualification);
	} return s;
	}
	public static void main(String args[] ) {
	}
	}
	