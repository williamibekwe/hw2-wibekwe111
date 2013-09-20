
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
 * Updated by JCasGen Fri Sep 20 11:56:49 EDT 2013
 * @generated */
public class Token_Type extends edu.cmu.deiis.types.Token_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.subTypes.Token");
 
  /** @generated */
  final Feature casFeat_TokenString;
  /** @generated */
  final int     casFeatCode_TokenString;
  /** @generated */ 
  public String getTokenString(int addr) {
        if (featOkTst && casFeat_TokenString == null)
      jcas.throwFeatMissing("TokenString", "edu.cmu.deiis.types.subTypes.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TokenString);
  }
  /** @generated */    
  public void setTokenString(int addr, String v) {
        if (featOkTst && casFeat_TokenString == null)
      jcas.throwFeatMissing("TokenString", "edu.cmu.deiis.types.subTypes.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_TokenString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TokenString = jcas.getRequiredFeatureDE(casType, "TokenString", "uima.cas.String", featOkTst);
    casFeatCode_TokenString  = (null == casFeat_TokenString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenString).getCode();

  }
}



    