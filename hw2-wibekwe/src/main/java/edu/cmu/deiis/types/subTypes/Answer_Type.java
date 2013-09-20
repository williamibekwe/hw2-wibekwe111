
/* First created by JCasGen Thu Sep 19 20:10:03 EDT 2013 */
package edu.cmu.deiis.types.subTypes;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.deiis.types.AnswerScore_Type;

/** 
 * Updated by JCasGen Fri Sep 20 11:56:49 EDT 2013
 * @generated */
public class Answer_Type extends AnswerScore_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.subTypes.Answer");
 
  /** @generated */
  final Feature casFeat_SentenceStructure;
  /** @generated */
  final int     casFeatCode_SentenceStructure;
  /** @generated */ 
  public int getSentenceStructure(int addr) {
        if (featOkTst && casFeat_SentenceStructure == null)
      jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SentenceStructure);
  }
  /** @generated */    
  public void setSentenceStructure(int addr, int v) {
        if (featOkTst && casFeat_SentenceStructure == null)
      jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_SentenceStructure, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnswerString;
  /** @generated */
  final int     casFeatCode_AnswerString;
  /** @generated */ 
  public String getAnswerString(int addr) {
        if (featOkTst && casFeat_AnswerString == null)
      jcas.throwFeatMissing("AnswerString", "edu.cmu.deiis.types.subTypes.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AnswerString);
  }
  /** @generated */    
  public void setAnswerString(int addr, String v) {
        if (featOkTst && casFeat_AnswerString == null)
      jcas.throwFeatMissing("AnswerString", "edu.cmu.deiis.types.subTypes.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_AnswerString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceStructure = jcas.getRequiredFeatureDE(casType, "SentenceStructure", "edu.cmu.deiis.types.subTypes.Sentence", featOkTst);
    casFeatCode_SentenceStructure  = (null == casFeat_SentenceStructure) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceStructure).getCode();

 
    casFeat_AnswerString = jcas.getRequiredFeatureDE(casType, "AnswerString", "uima.cas.String", featOkTst);
    casFeatCode_AnswerString  = (null == casFeat_AnswerString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerString).getCode();

  }
}



    