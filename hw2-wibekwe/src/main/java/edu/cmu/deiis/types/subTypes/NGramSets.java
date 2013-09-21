

/* First created by JCasGen Fri Sep 20 15:16:25 EDT 2013 */
package edu.cmu.deiis.types.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import edu.cmu.deiis.types.NGram;


/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * XML source: /Users/willibeamin/workspace/hw2-wibekwe/.git/hw2/hw2-wibekwe/src/main/resources/descriptors/subTypesDescriptor.xml
 * @generated */
public class NGramSets extends NGram {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramSets.class);
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
  protected NGramSets() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramSets(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramSets(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramSets(JCas jcas, int begin, int end) {
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
  //* Feature: NGramTokens

  /** getter for NGramTokens - gets 
   * @generated */
  public FSArray getNGramTokens() {
    if (NGramSets_Type.featOkTst && ((NGramSets_Type)jcasType).casFeat_NGramTokens == null)
      jcasType.jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSets_Type)jcasType).casFeatCode_NGramTokens)));}
    
  /** setter for NGramTokens - sets  
   * @generated */
  public void setNGramTokens(FSArray v) {
    if (NGramSets_Type.featOkTst && ((NGramSets_Type)jcasType).casFeat_NGramTokens == null)
      jcasType.jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramSets_Type)jcasType).casFeatCode_NGramTokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for NGramTokens - gets an indexed value - 
   * @generated */
  public Token getNGramTokens(int i) {
    if (NGramSets_Type.featOkTst && ((NGramSets_Type)jcasType).casFeat_NGramTokens == null)
      jcasType.jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSets_Type)jcasType).casFeatCode_NGramTokens), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSets_Type)jcasType).casFeatCode_NGramTokens), i)));}

  /** indexed setter for NGramTokens - sets an indexed value - 
   * @generated */
  public void setNGramTokens(int i, Token v) { 
    if (NGramSets_Type.featOkTst && ((NGramSets_Type)jcasType).casFeat_NGramTokens == null)
      jcasType.jcas.throwFeatMissing("NGramTokens", "edu.cmu.deiis.types.subTypes.NGramSets");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSets_Type)jcasType).casFeatCode_NGramTokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramSets_Type)jcasType).casFeatCode_NGramTokens), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    