# Choice Parser Example

This project shows, that repeating [choice](https://www.hl7.org/fhir/formats.html#choice) fields
are not reported during parsing of a FHIR resource.

The class to trigger this behavior is [de.fraunhofer.fokus.Main](src/main/java/de/fraunhofer/fokus/Main.java).  
The example resource with a duplicate choice filed is [person-example.xml](src/main/resources/person-example.xml).