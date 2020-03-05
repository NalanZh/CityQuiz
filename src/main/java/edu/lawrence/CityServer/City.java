/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lawrence.CityServer;

/**
 *
 * @author Joe Gregg
 */
public class City {
    private int id;
    private String capital;
    private String choices[];
    private int answer;
    
    public City() {}

    public int getId() { 
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }
    
    public int getAnswer() {
        return answer;
    }
    
    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
