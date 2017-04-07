package com.heartbeat.clientApi.clinical.service;

import com.heartbeat.clientApi.clinical.bean.PatientBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by valerie on 1/21/17.
 */
public class PatientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class.getName());

    public PatientBean getPatient(int patientId){

        LOGGER.debug("getPatient: {} ", patientId);

        return new PatientBean();
    }
}
