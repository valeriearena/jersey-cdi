package com.heartbeat.clientApi.clinical.resource;

import com.heartbeat.clientApi.clinical.service.PatientService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Created by valerie on 1/21/17.
 */
public class WebServiceBinder extends AbstractBinder {
        @Override
        protected void configure() {
            bind(PatientService.class).to(PatientService.class);
        }
}
