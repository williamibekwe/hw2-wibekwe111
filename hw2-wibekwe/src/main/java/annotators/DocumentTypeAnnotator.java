package annotators;

import edu.cmu.deiis.types.subTypes.*;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;

public class DocumentTypeAnnotator extends JCasAnnotator_ImplBase {
	
	/**
	   * @see JCasAnnotator_ImplBase#process(JCas)
	   */
	@Override
	 public void process(JCas aJCas) {
		
		//This annotator will get the document and split the contents into a question and a list of answers
		String d = "Q Booth shot Lincoln?\nA 1 Booth shot Lincoln.\nA 0 Lincoln shot Booth.\nA 1 Lincoln was shot by Booth.\nA 0 Booth was shot by Lincoln.\nA 1 Booth assassinated Lincoln.\nA 0 Lincoln assassinated Booth.\nA 1 Lincoln was assassinated by Booth.\nA 0 Booth was assassinated by Lincoln.";
		String[] document = d.split("\n"); 
		System.out.println("Here is " + aJCas.getViewName() +"-->" +  d);
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
		System.out.println("no error");
	}
}
