package ca.uhn.hl7v2.model.v23.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v23.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RRA_O02_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common order segment) <b></b><br>
 * 1: RRA_O02_ADMINISTRATION (a Group object) <b>optional repeating</b><br>
 */
public class RRA_O02_ORDER extends AbstractGroup {

	/** 
	 * Creates a new RRA_O02_ORDER Group.
	 */
	public RRA_O02_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(RRA_O02_ADMINISTRATION.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RRA_O02_ORDER - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns ORC (Common order segment) - creates it if necessary
	 */
	public ORC getORC() { 
	   ORC ret = null;
	   try {
	      ret = (ORC)this.get("ORC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RRA_O02_ADMINISTRATION (a Group object) - creates it if necessary
	 */
	public RRA_O02_ADMINISTRATION getADMINISTRATION() { 
	   RRA_O02_ADMINISTRATION ret = null;
	   try {
	      ret = (RRA_O02_ADMINISTRATION)this.get("ADMINISTRATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RRA_O02_ADMINISTRATION
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RRA_O02_ADMINISTRATION getADMINISTRATION(int rep) throws HL7Exception { 
	   return (RRA_O02_ADMINISTRATION)this.get("ADMINISTRATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RRA_O02_ADMINISTRATION 
	 */ 
	public int getADMINISTRATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ADMINISTRATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

}