package eu.fbk.eso.reasoner;

import org.omg.CORBA.IRObject;
import org.openrdf.model.Namespace;
import org.openrdf.model.URI;
import org.openrdf.model.impl.NamespaceImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * Constants for the KnowledgeStore Core Data Model.
 * 
 * @see <a href="http://dkm.fbk.eu/ontologies/knowledgestore">vocabulary specification</a>
 */
public final class ESO {

    // Recommended prefix
    public static final String PREFIX = "eso";

    // Namespaces
    public static final String NAMESPACE = "http://www.newsreader-project.eu/domain-ontology#";
    public static final String FN_NAMESPACE = "http://www.newsreader-project.eu/framenet#";

    // Classes
    public static final URI correspondToFrameNetElement = createURI("correspondToFrameNetElement");
    public static final URI correspondToFrameNetFrame = createURI("correspondToFrameNetFrame");
    public static final URI triggersDuringSituationRule = createURI("triggersDuringSituationRule");
    public static final URI triggersPreSituationRule = createURI("triggersPreSituationRule");
    public static final URI triggersPostSituationRule = createURI("triggersPostSituationRule");
    public static final URI triggersSituationRule = createURI("triggersSituationRule");

    public static final URI situationRule = createURI("SituationRule");
    public static final URI situationRuleAssertion = createURI("SituationRuleAssertion");
    public static final URI binaryRuleAssertion = createURI("BinarySituationRuleAssertion");
    public static final URI unaryRuleAssertion = createURI("UnarySituationRuleAssertion");
    public static final URI hasSituationAssertionSubject = createURI("hasSituationAssertionSubject");
    public static final URI hasSituationAssertionProperty = createURI("hasSituationAssertionProperty");
    public static final URI hasSituationAssertionObject = createURI("hasSituationAssertionObject");
    public static final URI hasSituationAssertionObjectValue = createURI("hasSituationAssertionObjectValue");
    public static final URI hasSituationRuleAssertion = createURI("hasSituationRuleAssertion");
    public static final URI situation = createURI("Situation");
    public static final URI hasPreSituation = createURI("hasPreSituation");
    public static final URI hasPostSituation = createURI("hasPostSituation");
    public static final URI hasDuringSituation = createURI("hasDuringSituation");

    public static final URI day = createURIFromScratch("http://www.w3.org/TR/owl-time#day");
    public static final URI month = createURIFromScratch("http://www.w3.org/TR/owl-time#month");
    public static final URI year = createURIFromScratch("http://www.w3.org/TR/owl-time#year");

    // Generic and useful
    public static final URI a = createURIFromScratch("http://www.w3.org/1999/02/22-rdf-syntax-ns#type");
    public static final URI subclassOf = createURIFromScratch("http://www.w3.org/2000/01/rdf-schema#subClassOf");
    public static final URI subpropertyOf = createURIFromScratch("http://www.w3.org/2000/01/rdf-schema#subPropertyOf");
    public static final URI event = createURIFromScratch("http://semanticweb.cs.vu.nl/2009/11/sem/Event");
    public static final URI owlClass = createURIFromScratch("http://www.w3.org/2002/07/owl#Class");
    public static final URI owlProperty = createURIFromScratch("http://www.w3.org/2002/07/owl#ObjectProperty");
    public static final URI onProperty = createURIFromScratch("http://www.w3.org/2002/07/owl#onProperty");
    public static final URI hasValue = createURIFromScratch("http://www.w3.org/2002/07/owl#hasValue");
    public static final URI hasTime = createURIFromScratch("http://semanticweb.cs.vu.nl/2009/11/sem/hasTime");

    // Helper methods
    public static URI createURI(final String localName) {
        return ValueFactoryImpl.getInstance().createURI(NAMESPACE, localName);
    }
    public static URI createURIFromScratch(final String localName) {
        return ValueFactoryImpl.getInstance().createURI(localName);
    }

}
