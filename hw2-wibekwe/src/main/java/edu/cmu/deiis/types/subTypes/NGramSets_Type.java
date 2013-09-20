
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
 * Updated by JCasGen Fri Sep 20 11:56:49 EDT 2013
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
  final Feature casFeat_Token;
  /** @generated */
  final int     casFeatCode_Token;
  /** @generated */ 
  public int getToken(int addr) {
        if (featOkTst && casFeat_Token == null)
      jcas.throwFeatMissing("Token", "edu.cmu.deiis.types.subTypes.NGramSets");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Token);
  }
  /** @generated */    
  public void setToken(int addr, int v) {
        if (featOkTst && casFeat_Token == null)
      jcas.throwFeatMissing("Token", "edu.cmu.deiis.types.subTypes.NGramSets");
    ll_cas.ll_setRefValue(addr, casFeatCode_Token, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramSets_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Token = jcas.getRequiredFeatureDE(casType, "Token", "edu.cmu.deiis.types.subTypes.Token", featOkTst);
    casFeatCode_Token  = (null == casFeat_Token) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Token).getCode();

  }
}



    