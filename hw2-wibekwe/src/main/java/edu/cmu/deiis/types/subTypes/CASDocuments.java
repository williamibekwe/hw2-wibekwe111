

/* First created by JCasGen Thu Sep 19 20:10:03 EDT 2013 */
package edu.cmu.deiis.types.subTypes;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** 
 * Updated by JCasGen Fri Sep 20 15:16:25 EDT 2013
 * XML source: /Users/willibeamin/workspace/hw2-wibekwe/.git/hw2/hw2-wibekwe/src/main/resources/descriptors/subTypesDescriptor.xml
 * @generated */
public class CASDocuments extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CASDocuments.class);
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
  protected CASDocuments() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public CASDocuments(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public CASDocuments(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public CASDocuments(JCas jcas, int begin, int end) {
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
  //* Feature: Question

  /** getter for Question - gets 
   * @generated */
  public Question getQuestion() {
    if (CASDocuments_Type.featOkTst && ((CASDocuments_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "edu.cmu.deiis.types.subTypes.CASDocuments");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CASDocuments_Type)jcasType).casFeatCode_Question)));}
    
  /** setter for Question - sets  
   * @generated */
  public void setQuestion(Question v) {
    if (CASDocuments_Type.featOkTst && ((CASDocuments_Type)jcasType).casFeat_Question == null)
      jcasType.jcas.throwFeatMissing("Question", "edu.cmu.deiis.types.subTypes.CASDocuments");
    jcasType.ll_cas.ll_setRefValue(addr, ((CASDocuments_Type)jcasType).casFeatCode_Question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Answers

  /** getter for Answers - gets 
   * @generated */
  public Answers getAnswers() {
    if (CASDocuments_Type.featOkTst && ((CASDocuments_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "edu.cmu.deiis.types.subTypes.CASDocuments");
    return (Answers)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CASDocuments_Type)jcasType).casFeatCode_Answers)));}
    
  /** setter for Answers - sets  
   * @generated */
  public void setAnswers(Answers v) {
    if (CASDocuments_Type.featOkTst && ((CASDocuments_Type)jcasType).casFeat_Answers == null)
      jcasType.jcas.throwFeatMissing("Answers", "edu.cmu.deiis.types.subTypes.CASDocuments");
    jcasType.ll_cas.ll_setRefValue(addr, ((CASDocuments_Type)jcasType).casFeatCode_Answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    