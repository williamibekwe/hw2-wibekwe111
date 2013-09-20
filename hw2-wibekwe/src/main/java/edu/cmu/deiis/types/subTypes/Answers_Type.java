
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
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Sep 20 11:56:49 EDT 2013
 * @generated */
public class Answers_Type extends AnnotationBase_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answers_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answers_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answers(addr, Answers_Type.this);
  			   Answers_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answers(addr, Answers_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answers.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.subTypes.Answers");
 
  /** @generated */
  final Feature casFeat_AnswerList;
  /** @generated */
  final int     casFeatCode_AnswerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "edu.cmu.deiis.types.subTypes.Answers");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "edu.cmu.deiis.types.subTypes.Answers");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerList, v);}
    
   /** @generated */
  public int getAnswerList(int addr, int i) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "edu.cmu.deiis.types.subTypes.Answers");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList), i);
  }
   
  /** @generated */ 
  public void setAnswerList(int addr, int i, int v) {
        if (featOkTst && casFeat_AnswerList == null)
      jcas.throwFeatMissing("AnswerList", "edu.cmu.deiis.types.subTypes.Answers");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerList), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answers_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AnswerList = jcas.getRequiredFeatureDE(casType, "AnswerList", "uima.cas.FSArray", featOkTst);
    casFeatCode_AnswerList  = (null == casFeat_AnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerList).getCode();

  }
}



    