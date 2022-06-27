package doselect;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws
	NotEligibleException{
	String s= new String();
	if (age >= 19){
	if (age >= 21 && highestQualification.equals("B.E"))
	s = "We have openings for junior developer";
	else if (age >= 26 &&
	(highestQualification.equals("M.S"))||(highestQualification.equals("PhD")))
	s = "We have openings for senior developer";
	else if (age >= 19 && !(highestQualification.equals("B.E"))
	&& !(highestQualification.equals("M.S")) &&
	!(highestQualification.equals("PhD")))
	throw new NotEligibleException("We do not have any job that matches your qualifications");
	else
	s = "Sorry we have no openings for now";
	}
	else
	throw new NotEligibleException("You are underage for any job");
	return s;
	}

}
