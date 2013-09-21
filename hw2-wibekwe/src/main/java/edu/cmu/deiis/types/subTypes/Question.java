

/* First created by JCasGen Fri Sep 20 11:43:04 EDT 2013 */
package edu.cmu.deiis.types.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * XML source: /Users/willibeamin/workspace/hw2-wibekwe/.git/hw2/hw2-wibekwe/src/main/resources/descriptors/subTypesDescriptor.xml
 * @generated */
public class Question extends edu.cmu.deiis.types.Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_SentenceStructure == null)
      jcasType.jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Question");
    return (Sentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_SentenceStructure)));}
    
  /** setter for SentenceStructure - sets  
   * @generated */
  public void setSentenceStructure(Sentence v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_SentenceStructure == null)
      jcasType.jcas.throwFeatMissing("SentenceStructure", "edu.cmu.deiis.types.subTypes.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_SentenceStructure, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: QuestionsString

  /** getter for QuestionsString - gets 
   * @generated */
  public String getQuestionsString() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionsString == null)
      jcasType.jcas.throwFeatMissing("QuestionsString", "edu.cmu.deiis.types.subTypes.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionsString);}
    
  /** setter for QuestionsString - sets  
   * @generated */
  public void setQuestionsString(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_QuestionsString == null)
      jcasType.jcas.throwFeatMissing("QuestionsString", "edu.cmu.deiis.types.subTypes.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_QuestionsString, v);}    
  }

    