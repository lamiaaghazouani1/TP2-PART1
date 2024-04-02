package ma.enset.activite2.services;

import ma.enset.activite2.entities.Consultation;
import ma.enset.activite2.entities.Medecin;
import ma.enset.activite2.entities.Patient;
import ma.enset.activite2.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}