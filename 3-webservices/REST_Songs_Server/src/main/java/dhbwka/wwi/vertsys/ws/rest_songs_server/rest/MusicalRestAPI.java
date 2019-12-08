/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 *
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 *
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package dhbwka.wwi.vertsys.ws.rest_songs_server.rest;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Einstiegspunkt für unseren REST-Webservice. Hier wird der URL-Prefix aller
 * Aufrufe definiert (über @ApplicationPath), sowie alle Collections und
 * Resourcen dem Webservice hinzugefügt. Diese Klasse muss daher immer angepasst
 * werden, wenn weitere Collections oder Resourcen hinzukommen.
 */
@ApplicationPath("api")
public class MusicalRestAPI extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        
        // Hier für jede Webservice-Klasse eine Zeile hinzufügen
        resources.add(SignUpUser.class);
        resources.add(CreateDemoData.class);
        resources.add(SongResource.class);

        return resources;
    }

}
