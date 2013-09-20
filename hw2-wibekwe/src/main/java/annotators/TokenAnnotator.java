package annotators;

import java.util.Iterator;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;

import edu.cmu.deiis.types.subTypes.*;

public class TokenAnnotator extends JCasAnnotator_ImplBase {
		
	@Override
	public void process(JCas jcas) {
		FSIndex<Annotation> docIndex = jcas.getAnnotationIndex(CASDocuments.type);
		Iterator<Annotation> iter = docIndex.iterator();
		CASDocuments document = (CASDocuments) iter.next();
		Question question = document.getQuestion();		
		String[] questionTokens = question.getQuestionsString().split(" "); 
		FSArray qtokenList =new FSArray(jcas, questionTokens.length-1); 
		for( int i = 0; i < qtokenList.size()-1; i++ ) { 
			Token t =new Token(jcas); 
			t.setTokenString(questionTokens[i+1]);
			qtokenList.set(i, t);
		}
		Sentence sentence = question.getSentenceStructure(); 
		sentence.setTokenList(qtokenList);
		question.setSentenceStructure(sentence);
		document.setQuestion(question);
		
		//Answers
		Answers answers = document.getAnswers();
		FSArray answerList = answers.getAnswerList();
		for( int i = 0; i < answerList.size(); i++ ){ 
			Answer a = (Answer) answerList.get(i);
			String[] answerTokens = a.getAnswerString().split(" ");
			FSArray atokenList =new FSArray(jcas, answerTokens.length-2); 
			for( int j = 0; j < answerTokens.length-2; j++ ){ 
				Token t =new Token(jcas); 
				t.setTokenString(answerTokens[i+2]);
				atokenList.set(j, t);
			}
			Sentence answerSentence = a.getSentenceStructure(); 
			answerSentence.setTokenList(atokenList);
			a.setSentenceStructure(answerSentence);
			answerList.set(i, a);
		}
		answers.setAnswerList(answerList);
		
		
		document.setAnswers(answers);
		document.setQuestion(question);		
		
	}

}
