

/* First created by JCasGen Fri Sep 20 11:48:05 EDT 2013 */
package edu.cmu.deiis.types.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.AnswerScore;


/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * XML source: /Users/willibeamin/workspace/hw2-wibekwe/.git/hw2/hw2-wibekwe/src/main/resources/descriptors/subTypesDescriptor.xml
 * @generated */
public class Answer extends AnswerScore {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: SentenceStructure

  /** getter for SentenceStructure - gets 
   * @generated */
  public Sentence getSentenceStructure() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_SentenceStructure == null)
      jcasType.jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Answer");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_SentenceStructure)));}
    
  /** setter for SentenceStructure - sets  
   * @generated */
  public void setSentenceStructure(Sentence v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_SentenceStructure == null)
      jcasType.jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_SentenceStructure, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: AnswerString

  /** getter for AnswerString - gets 
   * @generated */
  public String getAnswerString() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_AnswerString == null)
      jcasType.jcas.throwFeatMissing("AnswerString", "edu.cmu.deiis.types.subTypes.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_AnswerString);}
    
  /** setter for AnswerString - sets  
   * @generated */
  public void setAnswerString(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_AnswerString == null)
      jcasType.jcas.throwFeatMissing("AnswerString", "edu.cmu.deiis.types.subTypes.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_AnswerString, v);}    
  }

    