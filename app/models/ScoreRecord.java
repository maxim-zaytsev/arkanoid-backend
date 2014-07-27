package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: codein
 * Date: 7/25/14
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ScoreRecord extends Model {
  private String name;
  private int scores;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getScores() {
    return scores;
  }
  public void setScores(int scores) {
    this.scores = scores;
  }
}
