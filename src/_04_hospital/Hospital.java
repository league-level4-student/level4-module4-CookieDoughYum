package _04_hospital;

import java.util.ArrayList;
public class Hospital{
	
ArrayList<Doctor> doctors=new ArrayList<Doctor>();
ArrayList<Patient> patients=new ArrayList<Patient>();

		public void addDoctor(Doctor doctor) {
			// TODO Auto-generated method stub
			doctors.add(doctor);
		}

		public ArrayList<Doctor> getDoctors() {
			// TODO Auto-generated method stub
			return doctors;
		}

		public void addPatient(Patient patient) {
			// TODO Auto-generated method stub
			patients.add(patient);
		}

		public ArrayList<Patient> getPatients() {
			// TODO Auto-generated method stub
			return patients;
		}
}
