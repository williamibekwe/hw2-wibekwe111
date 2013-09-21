

/* First created by JCasGen Thu Sep 19 20:10:03 EDT 2013 */
package edu.cmu.deiis.types.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * XML source: /Users/willibeamin/workspace/hw2-wibekwe/.git/hw2/hw2-wibekwe/src/main/resources/descriptors/subTypesDescriptor.xml
 * @generated */
public class Token extends edu.cmu.deiis.types.Token {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: TokenString

  /** getter for TokenString - gets 
   * @generated */
  public String getTokenString() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenString == null)
      jcasType.jcas.throwFeatMissing("TokenString", "edu.cmu.deiis.types.subTypes.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_TokenString);}
    
  /** setter for TokenString - sets  
   * @generated */
  public void setTokenString(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_TokenString == null)
      jcasType.jcas.throwFeatMissing("TokenString", "edu.cmu.deiis.types.subTypes.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_TokenString, v);}    
  }

    