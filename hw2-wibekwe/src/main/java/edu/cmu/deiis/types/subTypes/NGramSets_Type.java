
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
import edu.cmu.deiis.types.NGram_Type;

/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * @generated */
public class NGramSets_Type extends NGram_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramSets_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramSets_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramSets(addr, NGramSets_Type.this);
  			   NGramSets_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramSets(addr, NGramSets_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramSets.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.subTypes.NGramSets");
 
  /** @generated */
  final Feature casFeat_NGramTokens;
  /** @generated */
  final int     casFeatCode_NGramTokens;
  /** @generated */ 
  public int getNGramTokens(int addr) {
        if (featOkTst && casFeat_NGramTokens == null)
      jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    return ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens);
  }
  /** @generated */    
  public void setNGramTokens(int addr, int v) {
        if (featOkTst && casFeat_NGramTokens == null)
      jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    ll_cas.ll_setRefValue(addr, casFeatCode_NGramTokens, v);}
    
   /** @generated */
  public int getNGramTokens(int addr, int i) {
        if (featOkTst && casFeat_NGramTokens == null)
      jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens), i);
  }
   
  /** @generated */ 
  public void setNGramTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_NGramTokens == null)
      jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_NGramTokens), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramSets_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_NGramTokens = jcas.getRequiredFeatureDE(casType, "NGramTokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_NGramTokens  = (null == casFeat_NGramTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NGramTokens).getCode();

  }
}



    