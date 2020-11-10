/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.pojo;

/**
 *
 * @author Admin
 */
public class Choice {
    private String id;
    private String content;
    private Question question;
    private boolean correct;
    
    public Choice(String id, String content, Question question, boolean correct)
    {
        this.id = id;
        this.content = content;
        this.question = question;
        this.correct = correct;
    }
}
