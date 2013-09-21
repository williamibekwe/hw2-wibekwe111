
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
import org.apache.uima.jcas.tcas.DocumentAnnotation_Type;

/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * @generated */
public class CASDocuments_Type extends DocumentAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (CASDocuments_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = CASDocuments_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new CASDocuments(addr, CASDocuments_Type.this);
  			   CASDocuments_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new CASDocuments(addr, CASDocuments_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CASDocuments.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.subTypes.CASDocuments");
 
  /** @generated */
  final Feature casFeat_Question;
  /** @generated */
  final int     casFeatCode_Question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "edu.cmu.deiis.types.subTypes.CASDocuments");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_Question == null)
      jcas.throwFeatMissing("Question", "edu.cmu.deiis.types.subTypes.CASDocuments");
    ll_cas.ll_setRefValue(addr, casFeatCode_Question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Answers;
  /** @generated */
  final int     casFeatCode_Answers;
  /** @generated */ 
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "edu.cmu.deiis.types.subTypes.CASDocuments");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Answers);
  }
  /** @generated */    
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_Answers == null)
      jcas.throwFeatMissing("Answers", "edu.cmu.deiis.types.subTypes.CASDocuments");
    ll_cas.ll_setRefValue(addr, casFeatCode_Answers, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public CASDocuments_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Question = jcas.getRequiredFeatureDE(casType, "Question", "edu.cmu.deiis.types.subTypes.Question", featOkTst);
    casFeatCode_Question  = (null == casFeat_Question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Question).getCode();

 
    casFeat_Answers = jcas.getRequiredFeatureDE(casType, "Answers", "edu.cmu.deiis.types.subTypes.Answers", featOkTst);
    casFeatCode_Answers  = (null == casFeat_Answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Answers).getCode();

  }
}



    