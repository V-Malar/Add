package Week;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

interface DiseaseControlManager {

	Disease addDisease(String name, boolean infectious);
	// Adds a new disease to a application

	Disease getDisease(UUID diseaseId);
	// Returns the disease or null if not found

	Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);
	// Adds a new patient to the application. Supply the max parameters to the
	// Patient constructor

	Patient getPatient(UUID patientId);
	// Returns the patient or null if not found

	void addDiseaseToPatient(UUID patientId, UUID diseaseId);
	// Adds a disease to a patient

	void addExposureToPatient(UUID patientId, Exposure exposure);
	// Adds an Exposure instance to a patient
}

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;

	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (maxDiseases <= 0 || maxPatients <= 0) {
			throw new IllegalArgumentException("Max diseases and max patients must be greater than 0.");
		}
		diseases = new Disease[maxDiseases];
		patients = new Patient[maxPatients];
	}

	@Override
	public Disease addDisease(String name, boolean infectious) {
		Disease newDisease;

		if (infectious) {
			newDisease = new InfectiousDisease();
		} else {
			newDisease = new NonInfectiousDisease();
		}

		newDisease.setName(name);

		for (int i = 0; i < diseases.length; i++) {
			if (diseases[i] == null) {
				diseases[i] = newDisease;
				return newDisease;
			}
		}

		throw new IllegalStateException("No more space to add diseases.");
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for (Disease disease : diseases) {
			if (disease != null && disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		Patient newPatient = new Patient(firstName, lastName, maxDiseases, maxExposures);

		for (int i = 0; i < patients.length; i++) {
			if (patients[i] == null) {
				patients[i] = newPatient;
				return newPatient;
			}
		}

		throw new IllegalStateException("No more space to add patients.");
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient patient : patients) {
			if (patient != null && patient.getPatientId().equals(patientId)) {
				return patient;
			}
		}
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = null;
		for (Patient p : patients) {
			if (p != null && p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}

		if (patient == null) {
			throw new IllegalArgumentException("Patient with ID " + patientId + " not found.");
		}

		Disease disease = null;
		for (Disease d : diseases) {
			if (d != null && d.getDiseaseId().equals(diseaseId)) {
				disease = d;
				break;
			}
		}

		if (disease == null) {
			throw new IllegalArgumentException("Disease with ID " + diseaseId + " not found.");
		}

		patient.addDiseaseId(diseaseId);
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient = null;
		for (Patient p : patients) {
			if (p != null && p.getPatientId().equals(patientId)) {
				patient = p;
				break;
			}
		}

		if (patient == null) {
			throw new IllegalArgumentException("Patient with ID " + patientId + " not found.");
		}

		patient.addExposure(exposure);
	}
	
public static void main(String args[]) {
	 DiseaseControlManagerImpl diseaseControlManager = new DiseaseControlManagerImpl(10, 10);

    Disease covid19 = diseaseControlManager.addDisease("COVID-19", true);
    covid19.setDiseaseId(UUID.randomUUID());
    Disease diabetes = diseaseControlManager.addDisease("Diabetes", false);
    diabetes.setDiseaseId(UUID.randomUUID());

    Patient patient = diseaseControlManager.addPatient("John", "Doe", 5, 5);
    patient.setPatientId(UUID.randomUUID());

    diseaseControlManager.addDiseaseToPatient(patient.getPatientId(), covid19.getDiseaseId());
    diseaseControlManager.addDiseaseToPatient(patient.getPatientId(), diabetes.getDiseaseId());

    Exposure exposure1 = new Exposure("D", LocalDateTime.now().minusDays(2));
    Exposure exposure2 = new Exposure("I", LocalDateTime.now().minusDays(1));

    patient.addExposure(exposure1);
    patient.addExposure(exposure2);

    System.out.println("Patient Information:");
    System.out.println(patient);

    Disease retrievedCovid19 = diseaseControlManager.getDisease(covid19.getDiseaseId());
    Disease retrievedDiabetes = diseaseControlManager.getDisease(diabetes.getDiseaseId());

    System.out.println("\nDisease Information:");
    System.out.println(retrievedCovid19);
    System.out.println(retrievedDiabetes);
}}

class Exposure {
	String exposureType;
	LocalDateTime dateTime;
	UUID patientId;

	public Exposure(String exposureType, LocalDateTime dateTime) {
		if (!Pattern.matches("[DI]", exposureType)) {
			throw new IllegalArgumentException("Value must be either D or I");
		} else {
			this.exposureType = exposureType;
		}
		this.dateTime = dateTime;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setExposure(String exposureType) {
		this.exposureType = exposureType;
	}

	public String getExposure() {
		return exposureType;
	}

	public String toString() {
		// PatientID: 123e4567-e89b-12d3-a456-426655440000 Exposure Type: I Date and
		// Time: " + dateTime
		return "PatientID: " + getPatientId().hashCode() + " Exposure Type: " + getExposure() + " Date and Time: "
				+ dateTime;
	}
}

abstract class Disease {

	UUID diseaseId;
	String name;

	abstract String[] getExamples();

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setDiseaseId(UUID id) {
		this.diseaseId = id;
	}

	UUID getDiseaseId() {
		return diseaseId;
	}

	public String toString() {
		return "\nName: " + getName() + " Disease-ID: " + getDiseaseId().hashCode();
	}
}

class InfectiousDisease extends Disease {

	@Override
	String[] getExamples() {
		return new String[] { "Influenza", "COVID-19", "Malaria", "Tuberculosis" };
	}
}

class NonInfectiousDisease extends Disease {

	@Override
	String[] getExamples() {
		return new String[] { "Diabetes", "Cancer", "Heart Disease", "Asthma" };
	}
}

class Patient {

	private UUID patientId;
	private String firstName;
	private String lastName;
	private Exposure[] exposures;
	private UUID[] diseaseIds;

	public Patient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (maxDiseases <= 0 || maxExposures <= 0) {
			throw new IllegalArgumentException("Max diseases and max exposures must be greater than 0.");
		}
		diseaseIds = new UUID[maxDiseases];
		exposures = new Exposure[maxExposures];
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void addDiseaseId(UUID diseaseId) {
		for (int i = 0; i < diseaseIds.length; i++) {
			if (diseaseIds[i] == null) {
				diseaseIds[i] = diseaseId;
				return;
			}
		}
		throw new IndexOutOfBoundsException("Disease IDs array is full.");
	}

	public void addExposure(Exposure exposure) {
		for (int i = 0; i < exposures.length; i++) {
			if (exposures[i] == null) {
				exposures[i] = exposure;
				return;
			}
		}
		throw new IndexOutOfBoundsException("Exposures array is full.");
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Exposure[] getExposures() {
		return exposures;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	@Override
	public int hashCode() {
		return patientId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Patient patient = (Patient) obj;
		return patientId.equals(patient.patientId);
	}

	@Override
	public String toString() {
		return "Patient{" + "patientId=" + patientId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
				+ '\'' + '}';
	}
}



//public static void main(String[] args) {
//DiseaseControlManagerImpl execute = new DiseaseControlManagerImpl(5, 5);
//execute.addDisease("Flu", true);
//UUID setId = UUID.randomUUID();
//execute.getDisease(setId);
//execute.addPatient("John", "Doe", 4, 4);
//execute.getPatient(setId);
//execute.addDiseaseToPatient(setId,setId);
//}



//for (UUID diseaseID : diseaseIds) {
//if (diseaseID == null) {
//	diseaseID = diseaseId;
//	return;
//}
//}
package Week;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DiseaseControlManagerTest {

	private DiseaseControlManager diseaseControlManager;
	private UUID patientId;
	private UUID covid19DiseaseId;
	Disease covid19, diabetes, lBP;
	Patient patient1, patient2, patient3;

	@Before
	public void setUp() {
		diseaseControlManager = new DiseaseControlManagerImpl(10, 10);
		// patientId = UUID.randomUUID();
	}

	@Test
	public void testAddDiseaseToPatient() {

		covid19 = diseaseControlManager.addDisease("COVID-19", true);
		covid19.setDiseaseId(UUID.randomUUID());
		diabetes = diseaseControlManager.addDisease("Diabetes", false);
		diabetes.setDiseaseId(UUID.randomUUID());
		lBP = diseaseControlManager.addDisease("LBP", false);
		lBP.setDiseaseId(UUID.randomUUID());

		patient1 = diseaseControlManager.addPatient("John", "Doe", 5, 5);
		patient2 = diseaseControlManager.addPatient("Jonhy", "Dow", 5, 5);
		patient3 = diseaseControlManager.addPatient("Sherlock", "Homes", 3, 3);

		patient1.setPatientId(UUID.randomUUID());
		patient2.setPatientId(UUID.randomUUID());
		patient3.setPatientId(UUID.randomUUID());

		diseaseControlManager.addDiseaseToPatient(patient1.getPatientId(), covid19.getDiseaseId());
		diseaseControlManager.addDiseaseToPatient(patient2.getPatientId(), diabetes.getDiseaseId());
		diseaseControlManager.addDiseaseToPatient(patient3.getPatientId(), lBP.getDiseaseId());

		diseaseControlManager.addDiseaseToPatient(patient2.getPatientId(), diabetes.getDiseaseId());
		diseaseControlManager.addDiseaseToPatient(patient2.getPatientId(), covid19.getDiseaseId());

		Exposure exposure1 = new Exposure("D", LocalDateTime.now().minusDays(2));
		exposure1.setPatientId(patient1.getPatientId());
		Exposure exposure2 = new Exposure("I", LocalDateTime.now().minusDays(1));
		exposure2.setPatientId(patient2.getPatientId());

//		ArrayList<Exposure> eList = new ArrayList<>();
//		eList.add(exposure1);
//		eList.add(exposure2);
//		System.out.println("Exposure Information:");
//		System.out.println(eList);

		patient1.addExposure(exposure1);
		patient1.addExposure(exposure2);
		patient2.addExposure(exposure2);
		patient2.addExposure(exposure1);

		ArrayList<Patient> pList = new ArrayList<>();
		pList.add(patient1);
		pList.add(patient2);
		pList.add(patient3);

		System.out.println("Patient Information:");
		System.out.println(pList);

		Disease retrievedCovid19 = diseaseControlManager.getDisease(covid19.getDiseaseId());
		Disease retrievedDiabetes = diseaseControlManager.getDisease(diabetes.getDiseaseId());

		System.out.println("\nDisease Information:");
		System.out.println(retrievedCovid19 + " " + patient1.getFirstName() + " " + patient1.getLastName());
		System.out.println(retrievedDiabetes + " " + patient2.getFirstName() + " " + patient2.getLastName());

		assertEquals(3, pList.size());
		assertEquals(patient1.getPatientId(), pList.get(0).getPatientId());
		assertEquals(patient2.getPatientId(), pList.get(1).getPatientId());
	}

	@Test
	public void testAddDiseaseToNonexistentPatient() {
		assertThrows(IllegalArgumentException.class,
				() -> diseaseControlManager.addDiseaseToPatient(UUID.randomUUID(), covid19DiseaseId));
	}

	@Test
	public void testAddExposureToNonexistentPatient() {
		patientId = UUID.randomUUID();
		Exposure exposure = new Exposure("D", LocalDateTime.now());
		exposure.setPatientId(patientId);

		assertThrows(IllegalArgumentException.class,
				() -> diseaseControlManager.addExposureToPatient(exposure.getPatientId(), exposure));
	}
}
