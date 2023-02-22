package de.fraunhofer.fokus;

import java.io.InputStream;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.parser.StrictErrorHandler;

public class Main {

  public static void main(String[] args) {
    FhirContext ctx = FhirContext.forR4();
    IParser parser = ctx.newXmlParser().setParserErrorHandler(new StrictErrorHandler());
    InputStream stream = Main.class.getResourceAsStream("/person-example.xml");
    parser.parseResource(stream);
  }
}
