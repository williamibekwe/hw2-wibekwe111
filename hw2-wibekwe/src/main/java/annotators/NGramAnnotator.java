package annotators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
		String questionString[] = question.getQuestionsString().split(" ");
		FSArray questionNGramsList =new FSArray(jcas, numberofNGrams);
		for(int i = 0; i < numberofNGrams; i++){
			//NGramSets ngs =new NGramSets(jcas); 
			FSArray qNGramsList =new FSArray( jcas, questionString.length);
			for( int j=1; j + i < questionString.length; j++ ){
				Token t =new Token(jcas); 
				String[] phrase = Arrays.copyOfRange(questionString,j,j+i+1);
				String p = "";
				for(String str: phrase)
			        p = p + " " + str;		
				//System.out.println(p);
				t.setTokenString(p);
				qNGramsList.set(j,t);
			}
			questionNGramsList.set(i,qNGramsList);
		}
		sentence.setNGramList(questionNGramsList);
		
		
		/*
		 * The block of code the the tokenlist from the each answer type in the answer list and 
		 * created the list of NGramSets and returns them back to the global index document 
		 */
		Answers answers = document.getAnswers(); 
		FSArray answerList = answers.getAnswerList();
		for( int count = 0; count < answerList.size(); count++){ 
			Answer ans = (Answer) answerList.get(count);
			Sentence answerSentence = ans.getSentenceStructure();
			String answerString[] = ans.getAnswerString().split(" ");
			FSArray answerNGramsList =new FSArray(jcas, numberofNGrams);
			for(int i = 0; i < numberofNGrams; i++){
				//NGramSets ngs =new NGramSets(jcas); 
				FSArray aNGramsList =new FSArray( jcas, answerString.length);
				for( int j=2; j + i < answerString.length; j++ ){
					Token t =new Token(jcas); 
					String[] phrase = Arrays.copyOfRange(answerString,j,j+i+1);
					String p = "";
					for(String str: phrase)
				        p = p + " " + str;		
					System.out.println(p);
					t.setTokenString(p);
					aNGramsList.set(j,t);
				}
				answerNGramsList.set(i,aNGramsList);
			}
			answerSentence.setNGramList(answerNGramsList);
			ans.setSentenceStructure(answerSentence);
			answerList.set(count, ans);
		}
		answers.setAnswerList(answerList);
		document.setAnswers(answers);
		document.setQuestion(question);
	}
}
