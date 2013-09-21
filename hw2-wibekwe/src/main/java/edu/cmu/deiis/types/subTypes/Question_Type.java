
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

/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * @generated */
public class Question_Type extends edu.cmu.deiis.types.Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.subTypes.Question");
 
  /** @generated */
  final Feature casFeat_SentenceStructure;
  /** @generated */
  final int     casFeatCode_SentenceStructure;
  /** @generated */ 
  public int getSentenceStructure(int addr) {
        if (featOkTst && casFeat_SentenceStructure == null)
      jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SentenceStructure);
  }
  /** @generated */    
  public void setSentenceStructure(int addr, int v) {
        if (featOkTst && casFeat_SentenceStructure == null)
      jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_SentenceStructure, v);}
    
  
 
  /** @generated */
  final Feature casFeat_QuestionsString;
  /** @generated */
  final int     casFeatCode_QuestionsString;
  /** @generated */ 
  public String getQuestionsString(int addr) {
        if (featOkTst && casFeat_QuestionsString == null)
      jcas.throwFeatMissing("QuestionsString", "edu.cmu.deiis.types.subTypes.Question");
    return ll_cas.ll_getStringValue(addr, casFeatCode_QuestionsString);
  }
  /** @generated */    
  public void setQuestionsString(int addr, String v) {
        if (featOkTst && casFeat_QuestionsString == null)
      jcas.throwFeatMissing("QuestionsString", "edu.cmu.deiis.types.subTypes.Question");
    ll_cas.ll_setStringValue(addr, casFeatCode_QuestionsString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceStructure = jcas.getRequiredFeatureDE(casType, "SentenceStructure", "edu.cmu.deiis.types.subTypes.Sentence", featOkTst);
    casFeatCode_SentenceStructure  = (null == casFeat_SentenceStructure) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceStructure).getCode();

 
    casFeat_QuestionsString = jcas.getRequiredFeatureDE(casType, "QuestionsString", "uima.cas.String", featOkTst);
    casFeatCode_QuestionsString  = (null == casFeat_QuestionsString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_QuestionsString).getCode();

  }
}



    