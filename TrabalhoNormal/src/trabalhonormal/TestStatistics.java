/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhonormal;

import interfaces.models.IQuestion;

/**
 *
 * @author joaosoares
 */
public class TestStatistics implements interfaces.controller.ITestStatistics{

    @Override
    public double meanTimePerAnswer() {
       return meanTimePerAnswer();
    }

    @Override
    public double standardDeviationTimePerAnsewer() {
        return standardDeviationTimePerAnsewer();
    }

    @Override
    public double correctAnswerPecentage() {
       return correctAnswerPecentage();
    }

    @Override
    public double incorrectAnswerPecentage() {
        return incorrectAnswerPecentage();
    }

    @Override
    public int correctAnswer() {
        return correctAnswer();
    }

    @Override
    public int incorrectAnswer() {
       return incorrectAnswer();
    }

    @Override
    public IQuestion[] incorrectAnswers() {
        return incorrectAnswers();
    }

    @Override
    public IQuestion[] correctAnswers() {
        return correctAnswers();
    }
    
}
