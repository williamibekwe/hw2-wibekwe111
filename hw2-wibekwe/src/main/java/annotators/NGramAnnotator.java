package annotators;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;

import edu.cmu.deiis.types.subTypes.Answer;
import edu.cmu.deiis.types.subTypes.Answers;
import edu.cmu.deiis.types.subTypes.CASDocuments;
import edu.cmu.deiis.types.subTypes.NGramSets;
import edu.cmu.deiis.types.subTypes.Question;
import edu.cmu.deiis.types.subTypes.Sentence;
import edu.cmu.deiis.types.subTypes.Token;


public class NGramAnnotator extends JCasAnnotator_ImplBase{

	private int numberofNGrams = 4; 
	@Override
	public void process( JCas jcas){
		/*
		 *This block of code gets the globally indexed file via iterator
		 *so it can be used for the tokenization
		 */
		FSIndex<Annotation> docIndex = jcas.getAnnotationIndex(CASDocuments.type);
		Iterator<Annotation> iter = docIndex.iterator(); 
		CASDocuments document = (CASDocuments)iter.next();
		
		/*
		 * The block of code the the token list from the question type and 
		 * created the list of NGramSets and returns them back to the global index document 
		 */
		Question question = document.getQuestion();
		Sentence sentence = question.getSentenceStructure();
		FSArray questionTokens = sentence.getTokenList(); 
		FSArray questionNGramsList = sentence.getNGramList();
		
		for(int i = 0; i < questionTokens.size(); i++){
			String phrase = "";
			for(int j = i, nIndex = 0; j < i + numberofNGrams && j < questionTokens.size(); j++, nIndex++){
				 Token t =new Token(jcas);
				 phrase += t.getTokenString();
				 NGramSets ngs = (NGramSets)questionNGramsList.get(nIndex);
				 ngs.setNGramTokens(i, t);
				 questionNGramsList.set(nIndex, ngs);
			}
		}
		sentence.setNGramList(questionNGramsList);
		
		
		/*
		 * The block of code the the tokenlist from the each answer type in the answer list and 
		 * created the list of NGramSets and returns them back to the global index document 
		 */
		Answers answers = document.getAnswers(); 
		FSArray answerList = answers.getAnswerList();
		for( int count = 0; count < answerList.size(); count++){ 
			Answer answer = (Answer) answerList.get(count);
			Sentence answerSentence = answer.getSentenceStructure();
			FSArray answerTokens = answerSentence.getTokenList(); 
			FSArray answerNGramsList = answerSentence.getNGramList();
			
			for(int i = 0; i < answerTokens.size(); i++){
				String phrase = "";
				for(int j = i, nIndex = 0; j < i + numberofNGrams && j < answerTokens.size(); j++, nIndex++){
					 Token t =new Token(jcas);
					 phrase += t.getTokenString();
					 NGramSets ngs = (NGramSets)answerNGramsList.get(nIndex);
					 ngs.setNGramTokens(i, t);
					 answerNGramsList.set(nIndex, ngs);
				}
			}
			answerSentence.setNGramList(answerNGramsList);
			answerList.set(count, answer);
		}
		answers.setAnswerList(answerList);
		
		document.setAnswers(answers);
		document.setQuestion(question);
	}
}
