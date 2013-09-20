package annotators;

import edu.cmu.deiis.types.subTypes.*;
import edu.cmu.deiis.types.subTypes.*;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;

public class DocumentTypeAnnotator extends JCasAnnotator_ImplBase {
	
	/**
	   * @see JCasAnnotator_ImplBase#process(JCas)
	   */
	@Override
	 public void process(JCas aJCas) {
		String[] document = aJCas.getDocumentText().split("\n"); 
		Question question =new Question(aJCas);
		Answers answers =new Answers(aJCas);
		CASDocuments doc =new CASDocuments(aJCas);
		FSArray answerList =new FSArray(aJCas, document.length - 1);
		if(document[0].startsWith("Q")){
			question.setQuestionsString(document[0]);
		}
		
		for( int i = 1; i < document.length; i++ ){
			Answer a =new Answer(aJCas);
			a.setAnswerString(document[i]);
			answerList.set(i-1, a);			
		}
		answers.setAnswerList(answerList); 

		doc.setQuestion(question);
		doc.setAnswers(answers); 
		// this will index this type as a document type. 
		doc.addToIndexes();
		
	}
}
