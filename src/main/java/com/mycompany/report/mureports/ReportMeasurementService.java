package com.mycompany.report.mureports;

import java.util.Date;

import com.mycompany.report.MUEvent;
import com.mycompany.report.MeasureFact;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by pandian on 8/12/16.
 */
public class ReportMeasurementService {

    public static final void main(final String[] args) {
        // KieServices is the factory for all KIE services
        KieServices ks = KieServices.Factory.get();

        // From the kie services, a container is created from the classpath
        KieContainer kc = ks.getKieClasspathContainer();

        long DAY_IN_MS = 1000 * 60 * 60 * 24;

        // The application can insert facts into the session
        final MUEvent muEvent = new MUEvent();
        muEvent.setEncounterDate(new Date(new Date().getTime() - (1 * DAY_IN_MS)));
        muEvent.setEventDate(new Date());
        muEvent.setFacilityId(1);
        muEvent.setEncounterId(2L);
        muEvent.setUserId(3L);
        muEvent.setEventType("CCDReceived");

        execute( kc , muEvent);

        final MUEvent muEventFailed = new MUEvent();
        muEventFailed.setEncounterDate(new Date(new Date().getTime() - (5 * DAY_IN_MS)));
        muEventFailed.setEventDate(new Date());
        muEventFailed.setFacilityId(1);
        muEventFailed.setEncounterId(5L);
        muEventFailed.setUserId(6L);
        muEventFailed.setEventType("CCDReceived");

        execute(kc, muEventFailed);
    }

    public static void execute( KieContainer kc , MUEvent muEvent) {
        KieSession ksession = kc.newKieSession("mureportks");

        MeasureFact measureFact = new MeasureFact();
        ksession.setGlobal( "measureFact",  measureFact);



        ksession.insert( muEvent );

        // and fire the rules
        ksession.fireAllRules();

        System.out.println("Fact: " + muEvent);
        System.out.println("Measurement Fact: " + measureFact);



        // and then dispose the session
        ksession.dispose();
    }

}
